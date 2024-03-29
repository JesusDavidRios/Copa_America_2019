package com.project.facade.impl;

import com.project.facade.UserFacade;
import com.project.model.UserModel;
import com.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserFacadeImpl implements UserFacade {
    @Autowired
    private UserService userService;
    @Autowired
    private BCryptPasswordEncoder encoder;
    @Override
    public List<UserModel> listAll() {
        return this.userService.listAll();
    }

    @Override
    public UserModel findById(int id) {
        return this.userService.getOne(id);
    }

    @Override
    public UserModel create(long id, String username, String pass, String level) {
        UserModel userModel = new UserModel();
        userModel.setId(id);
        userModel.setUsername(username);
        //userModel.setPassword(pass);
        userModel.setPassword(encoder.encode(pass));
        return this.userService.save(userModel);
    }
}
