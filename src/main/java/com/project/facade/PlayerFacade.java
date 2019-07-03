package com.project.facade;

import com.project.dto.PlayerDto;
import com.project.model.PlayerModel;

import java.util.List;

public interface PlayerFacade {

    List<PlayerModel> listAll();

    List<PlayerModel> findByName(String name);

    List<PlayerModel> updateTeamPlayer(int id, int teamId);

    PlayerDto showTeamPlayer(int id);
}
