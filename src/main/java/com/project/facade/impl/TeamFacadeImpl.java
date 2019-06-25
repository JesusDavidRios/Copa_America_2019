package com.project.facade.impl;

import com.project.facade.TeamFacade;
import com.project.model.TeamModel;
import com.project.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TeamFacadeImpl implements TeamFacade {

    @Autowired
    private TeamService teamService;

    @Override
    public List<TeamModel> listAll() {

        return teamService.listAll();
    }

    @Override
    public List<TeamModel> listTeamPlayer() {

        return null;
    }

    @Override
    public List<TeamModel> findByName(String name) {

        return teamService.findByName(name);
    }
}
