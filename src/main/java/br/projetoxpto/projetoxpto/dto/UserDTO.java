package br.projetoxpto.projetoxpto.dto;

import br.projetoxpto.projetoxpto.model.User;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UserDTO {
    private String nome;
    private String email;
    private String racf;

    public UserDTO(User user) {
        this.nome = user.getNome();
        this.email = user.getEmail();
        this.racf = user.getRacf();
    }

}