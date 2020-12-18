package br.projetoxpto.projetoxpto.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.projetoxpto.projetoxpto.dto.ContagemStatus;
import br.projetoxpto.projetoxpto.model.Transacao;

public interface TransacaoDAO extends CrudRepository<Transacao, Integer>{
    
@Query("SELECT new br.projetoxpto.projetoxpto.dto.ContagemStatus(t.agente.nomeAgente, status, COUNT(t.status)) FROM Transacao AS t WHERE t.agente.idAgente = ?1 GROUP BY t.agente.nomeAgente, t.status ORDER By status")
List<ContagemStatus> countStatusByAgent(int idAgente);
}
