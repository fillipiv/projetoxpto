package br.projetoxpto.projetoxpto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import br.projetoxpto.projetoxpto.dao.TransacaoDAO;
import br.projetoxpto.projetoxpto.dto.ContagemStatus;

@RestController
@CrossOrigin("*")
@RequestMapping("/transacao")
public class TransacaoController {

    
    @Autowired
    private TransacaoDAO dao;

    @GetMapping("/status/{id}") // buscar o agente e devolver a lista de sucesso, falha e fraude
    public List<ContagemStatus> statusTransacoes(@PathVariable int id){ 
    
        List<ContagemStatus> lista = (List<ContagemStatus>) dao.countStatusByAgent(id);
    
        return lista;
    }

}
