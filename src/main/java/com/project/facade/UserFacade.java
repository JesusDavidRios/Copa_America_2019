package com.project.facade;

import com.project.model.UserModel;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.List;

public interface UserFacade {

    List<UserModel> listAll();

    UserModel findById(int id);
    UserModel create(int id, String name, String pass, String level);
}
