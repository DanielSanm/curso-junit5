package br.com.personal.apirest.services;

import br.com.personal.apirest.domain.User;

import java.util.List;

public interface UserService {

    User findById(Integer id);
    List<User> findAll();
}
