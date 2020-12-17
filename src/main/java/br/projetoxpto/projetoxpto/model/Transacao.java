package br.projetoxpto.projetoxpto.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "mtb310_transaction")
@Getter @Setter @NoArgsConstructor
public class Transacao {
    

    @Id // chave primaria; 
    @GeneratedValue(strategy = GenerationType.IDENTITY) //1,2,3,4...;
    @Column (name = "id_transacao")
    private int idTransacao;

    @Column(name = "data_hora", nullable = false)
    private String DataHora;

    @Column(name = "dispositivo", nullable = false)
    private Integer dispositivo;

    @Column(name = "valor_solic", nullable = false)
    private float valorSolic;

    @Column(name = "valor_aut", nullable = false)
    private float valorAut;

    @Column(name = "status", nullable = false)
    private Integer status;

    //@Column(name = "ag_financeiro", nullable = false)
    //private Integer agFinanceiro;

   @ManyToOne
   @JoinColumn (name = "ag_financeiro")
   @JsonIgnoreProperties("transacao") //talvez seja "agente"
    private Agente agente; 

}
