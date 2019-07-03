package com.project.service;

import com.project.model.TeamModel;

import java.util.List;

public interface TeamService {

    List<TeamModel> listAll();
    List<TeamModel> findByName(String name);
    TeamModel getOne(int id);

}
