package com.project.dto;

import org.springframework.stereotype.Component;

@Component
public class PlayerDto {

    private int id;

    private int idTeam;
    private String name;
    private String teamName;
    private String last_name;
    private String club;
    private String position;

    //TODO
        /* implementar DTO teamPlayer
          usar mapper (model a dto)

          playerDTO dto = mapper.map(player, PlayerDto.class)
          dto.team(nombreTeam) // llamar teamService para obtener el nombre del equipo
          return dto;

          -----
              public playerDTO updateTeamPlayer(int id, int teamId) {

         */

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdTeam() {
        return idTeam;
    }

    public void setIdTeam(int idTeam) {
        this.idTeam = idTeam;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


   public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
