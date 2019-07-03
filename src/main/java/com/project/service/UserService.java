package com.project.service;

import com.project.model.UserModel;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {
    List<UserModel> listAll();

    UserModel getOne(int id);

    UserModel save(UserModel entity);
}
