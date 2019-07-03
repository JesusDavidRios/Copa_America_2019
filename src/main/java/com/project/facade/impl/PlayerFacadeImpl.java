package com.project.facade.impl;

import com.project.dto.PlayerDto;
import com.project.facade.PlayerFacade;
import com.project.model.PlayerModel;
import com.project.model.TeamModel;
import com.project.service.PlayerService;
import com.project.service.TeamService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.util.Arrays;
import java.util.List;

@Component
public class PlayerFacadeImpl implements PlayerFacade {

    @Autowired
    private PlayerService playerService;
    @Autowired
    private TeamService teamService;
    @Autowired
    private ModelMapper modelMapper;

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
        /*
    }
        //TODO
         implementar DTO teamPlayer
          usar mapper (model a dto)

          playerDTO dto = mapper.map(player, PlayerDto.class)
          dto.team(nombreTeam) // llamar teamService para obtener el nombre del equipo
          return dto;

          -----
              public playerDTO updateTeamPlayer(int id, int teamId) {
*/

        PlayerModel player = playerService.getOne(id);
        if (player.getIdTeam() != teamId) {
            player.setIdTeam(teamId);
            playerService.save(player);
        }
        return Arrays.asList(player);
    }

    @Override
    public PlayerDto showTeamPlayer(int id) {

        PlayerModel player = playerService.getOne(id);
        PlayerDto playerDto = modelMapper.map(player, PlayerDto.class);
        TeamModel teamModel = teamService.getOne(playerDto.getIdTeam());
        if (teamModel.getName() != null) {
            playerDto.setTeamName(teamModel.getName());
            playerService.save(player);
        }
        return playerDto;
    }
}
