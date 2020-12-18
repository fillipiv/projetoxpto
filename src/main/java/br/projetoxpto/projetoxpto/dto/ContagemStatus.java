package br.projetoxpto.projetoxpto.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class ContagemStatus {
    private String agente;
    private int status;
    private long count;

    public ContagemStatus(String agente, int status, long count) {
        this.agente = agente;
        this.status = status;
        this.count = count;
    }

}
