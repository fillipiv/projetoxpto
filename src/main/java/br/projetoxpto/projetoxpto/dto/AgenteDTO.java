package br.projetoxpto.projetoxpto.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class AgenteDTO {
    private Integer idAgente;
    private String nomeAgente;
    private float volumeTransacional;
}
