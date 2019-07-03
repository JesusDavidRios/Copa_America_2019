package com.project.facade;

import com.project.model.TeamModel;

import java.util.List;

public interface TeamFacade {

    List<TeamModel> listAll();

    List<TeamModel> findByName(String name);
}
