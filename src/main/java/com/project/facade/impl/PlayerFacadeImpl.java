package com.project.facade.impl;

import com.project.facade.PlayerFacade;
import com.project.model.PlayerModel;
import com.project.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class PlayerFacadeImpl implements PlayerFacade {

    @Autowired
    private PlayerService playerService;

    @Override
    public List<PlayerModel> listAll() {

        return playerService.listAll();
    }

    @Override
    public List<PlayerModel> findByName(String name) {

        return playerService.findByName(name);
    }

    @Override
    public List<PlayerModel> updateTeamPlayer(int id, int teamId) {
        //TODO
        /* implementar DTO teamPlayer
          usar mapper (model a dto)

          playerDTO dto = mapper.map(player, PlayerDto.class)
          dto.team(nombreTeam) // llamar teamService para obtener el nombre del equipo
          return dto;

          -----
              public playerDTO updateTeamPlayer(int id, int teamId) {

         */
        PlayerModel  player = playerService.getOne(id);
        if (player.getIdTeam() != teamId){
            player.setIdTeam(teamId);
            playerService.save(player);
        }
        return Arrays.asList(player);
    }
}
