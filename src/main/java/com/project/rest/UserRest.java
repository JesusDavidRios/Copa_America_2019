package com.project.rest;

import com.project.dao.UserDao;
import com.project.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/user")
public class UserRest {
    @Autowired
    private UserDao userDao;

    @GetMapping
    public List<UserModel> listAll() {
        return this.userDao.findAll();
    }

    @PostMapping
    public void insert(@RequestBody UserModel userModel) {
        this.userDao.save(userModel);
    }

    @PutMapping
    public void update(@RequestBody UserModel userModel) {
        this.userDao.save(userModel);
    }

    @DeleteMapping
    private void delete(@RequestBody UserModel userModel) {
        this.userDao.delete(userModel);
    }
}
