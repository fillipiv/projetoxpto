package br.projetoxpto.projetoxpto.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class ContagemStatus {
    private String agente;
    private int status;
    private long count;
    private float volumeTransacional;

    public ContagemStatus(String agente, float volumeTransacional, int status, long count) {
        this.agente = agente;
        this.volumeTransacional = volumeTransacional;
        this.status = status;
        this.count = count;
    }

}
