package br.projetoxpto.projetoxpto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.projetoxpto.projetoxpto.dao.AgenteDAO;
import br.projetoxpto.projetoxpto.model.Agente;

@RestController
@CrossOrigin("*")
@RequestMapping("/agente")
public class AgenteController {

    @Autowired
    private AgenteDAO dao; 

    @GetMapping("/listaagentes") // dúvida como retornar apenas a info da coluna nome_agente
    public List<Agente> listarAgentes(){
        List<Agente> lista = (List<Agente>) dao.findAll();
        
        return lista; 
    }

    @GetMapping("/top10") // vai retornar o nome + volume transação? Não deve apresentar id parceiro
    public List<Agente> listarTop10(){
        List<Agente> lista = (List<Agente>) dao.findTop10ByOrderByVolumeTransacionalDesc();

        return lista;
        
    }
}
