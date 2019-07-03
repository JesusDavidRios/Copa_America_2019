package com.project.service;

import com.project.model.UserModel;

import java.util.List;

public interface UserService {
    List<UserModel> listAll();

    UserModel getOne(int id);

    UserModel save(UserModel entity);
}
