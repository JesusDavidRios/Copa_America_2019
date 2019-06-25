package com.project.service.impl;

import com.project.dao.team.PlayerDao;
import com.project.model.PlayerModel;
import com.project.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PlayerServiceImpl implements PlayerService {
    @Autowired
    private PlayerDao playerDao;

    @Override
    public List<PlayerModel> listAll() {
        return playerDao.findAll();
    }

    @Override
    public List<PlayerModel> findByName(String name) {
        return playerDao.findByName(name);
    }

    @Override
    public PlayerModel getOne(int id) {
        return playerDao.getOne(id);
    }
    @Override
    public PlayerModel save(PlayerModel entity) {
        return playerDao.save(entity);
    }
}
