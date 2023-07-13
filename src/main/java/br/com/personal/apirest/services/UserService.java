package br.com.personal.apirest.services;

import br.com.personal.apirest.domain.User;
import br.com.personal.apirest.domain.dto.UserDTO;

import java.util.List;

public interface UserService {

    User findById(Integer id);
    List<User> findAll();
    User create(UserDTO obj);
    User update(UserDTO obj);
    void delete(Integer id);
}
