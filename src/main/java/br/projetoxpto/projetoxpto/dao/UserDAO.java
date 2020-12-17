package br.projetoxpto.projetoxpto.dao;

import org.springframework.data.repository.CrudRepository;

import br.projetoxpto.projetoxpto.model.User;

//CRUD - Create Read Update - Delete
public interface UserDAO extends CrudRepository<User, Integer> {
    //public User findByEmail(String email);

    public User findByEmailAndSenha(String email, String senha);

    public User findByEmailOrRacf(String email, String racf);



    /* @Query(value = "Select new User(u.name, u.email) from User u u.id = :cod ")
    public User buscaPorId(@Param("cod") Integer codigo); */

    /* @Query(value = "Select name, email from user where id = :cod", nativeQuery = true)
    public Object[] buscarUsuarioPorid(@Param("cod") Integer codigo); */
}
