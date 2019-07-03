package com.project.service.impl;

import com.project.dao.UserDao;
import com.project.model.UserModel;
import com.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public List<UserModel> listAll() {
        return this.userDao.findAll();
    }

    @Override
    public UserModel getOne(int id) {
        return this.userDao.getOne(id);
    }

    @Override
    public UserModel save(UserModel entity) {

        return this.userDao.save(entity);
    }
}
