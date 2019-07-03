package com.project.dao;

import com.project.model.TeamModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeamDao extends JpaRepository<TeamModel, Integer>{

    List<TeamModel> findByName(String name);

}
