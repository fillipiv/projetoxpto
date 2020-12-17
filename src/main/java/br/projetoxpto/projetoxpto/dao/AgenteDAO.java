package br.projetoxpto.projetoxpto.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.projetoxpto.projetoxpto.model.Agente;

public interface AgenteDAO extends CrudRepository<Agente, Integer> {
    public List<Agente> findByNomeAgente();
    
    public List<Agente> findByTop10ByOrderByVolumeTransacionalDesc();
}
