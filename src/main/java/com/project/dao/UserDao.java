package com.project.dao;

import com.project.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserDao extends JpaRepository<UserModel, Integer> {
    public Optional<UserModel> findByUsername(String userName);

}
