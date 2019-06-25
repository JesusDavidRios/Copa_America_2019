package com.project.service.impl;

import com.project.dao.team.TeamDao;
import com.project.model.TeamModel;
import com.project.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamServiceImpl implements TeamService {

    @Autowired
    private TeamDao teamDao;

    @Override
    public List<TeamModel> listAll() {
        return teamDao.findAll();
    }

    @Override
    public List<TeamModel> findByName(String name) {
        return teamDao.findByName(name);
    }
}
