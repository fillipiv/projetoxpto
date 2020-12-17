package br.projetoxpto.projetoxpto.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "mtb310_ag_financeiro")
@Getter @Setter @NoArgsConstructor
public class Agente {

    @Id // chave primaria; 
    @GeneratedValue(strategy = GenerationType.IDENTITY) //1,2,3,4...;
    @Column (name = "id_agente")
    private int idAgente;

    @Column(name = "nome_agente", length = 100, nullable = false)
    private String nameAgente;

    @Column(name = "volume_transacional", nullable = false)
    private float volumeTransacional;
}
