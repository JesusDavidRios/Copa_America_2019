package com.project.service.impl;

import com.project.dao.UserDao;
import com.project.model.AuthorityModel;
import com.project.model.UserModel;
import com.project.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserModel userModel = userDao.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("User not found"));

        List grantList = new ArrayList();
        for(AuthorityModel authorityModel: userModel.getAuthority()){
            GrantedAuthority grantedAuthority =  new SimpleGrantedAuthority(authorityModel.getAuthority());
            grantList.add(grantedAuthority);
        }

        UserDetails user = (UserDetails) new User(userModel.getUsername(), userModel.getPassword(), grantList);

        return user;
    }
}
