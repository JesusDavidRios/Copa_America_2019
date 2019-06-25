package com.project.service;

import com.project.model.PlayerModel;

import java.util.List;

public interface PlayerService {
    List<PlayerModel> listAll();
    List<PlayerModel> findByName(String name);

    PlayerModel getOne(int id);

    PlayerModel save(PlayerModel entity);

    }
