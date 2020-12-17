package br.projetoxpto.projetoxpto.model;

import java.security.Timestamp;

public class Transacao {
    

    @Id // chave primaria; 
    @GeneratedValue(strategy = GenerationType.IDENTITY) //1,2,3,4...;
    @Column (name = "id_transacao")
    private int idTransacao;

    @Column(name = "data_hora", nullable = false)
    private Timestamp DataHora;

    @Column(name = "dispositivo", nullable = false)
    private Integer dispositivo;

    @Column(name = "valor_solic", nullable = false)
    private float valorSolic;

    @Column(name = "valor_aut", nullable = false)
    private float valorAut;
}
