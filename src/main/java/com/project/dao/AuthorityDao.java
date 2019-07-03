package com.project.dao;

import com.project.model.AuthorityModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityDao extends JpaRepository<AuthorityModel, Integer> {

}
