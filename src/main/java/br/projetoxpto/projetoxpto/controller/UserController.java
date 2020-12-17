package br.projetoxpto.projetoxpto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.projetoxpto.projetoxpto.dao.UserDAO;
import br.projetoxpto.projetoxpto.dto.UserDTO;
import br.projetoxpto.projetoxpto.model.User;

@RestController
@CrossOrigin("*")
@RequestMapping("/user")
public class UserController {
    
    @Autowired // injeção de dependência
    private UserDAO dao;

    @PostMapping("/login")
    public ResponseEntity<UserDTO> login(@RequestBody User user){
        User userFinded = dao.findByEmailOrRacf(user.getEmail(), user.getRacf());
        
        if(userFinded != null){
            if(user.getSenha().equals(userFinded.getSenha())){
                UserDTO userDTO = new UserDTO(userFinded);
                return ResponseEntity.ok(userDTO);
            }
            //return ResponseEntity.status(401).build(); - não é necessário, fica duplicado;
        }
        return ResponseEntity.status(401).build();
    }
}
