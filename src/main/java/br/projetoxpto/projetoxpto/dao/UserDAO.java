package br.projetoxpto.projetoxpto.dao;

import org.springframework.data.repository.CrudRepository;

import br.projetoxpto.projetoxpto.model.User;

//CRUD - Create Read Update - Delete
public interface UserDAO extends CrudRepository<User, Integer> {

    public User findByEmailAndSenha(String email, String senha);

    public User findByEmailOrRacf(String email, String racf);

}
