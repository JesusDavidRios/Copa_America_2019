package com.project.facade;

import com.project.model.UserModel;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.List;

public interface UserFacade {

    List<UserModel> listAll();

    UserModel findById(int id);
    UserModel create(long id, String username, String pass, String level);
}
