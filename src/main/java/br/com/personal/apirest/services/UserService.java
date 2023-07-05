package br.com.personal.apirest.services;

import br.com.personal.apirest.domain.User;

public interface UserService {

    User findById(Integer id);
}
