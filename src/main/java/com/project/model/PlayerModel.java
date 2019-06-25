package com.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "player")
public class PlayerModel {

    @Id
    private int id;

    @Column(name = "idteam")
    private int idTeam;
    @Column(name = "name", length = 45)
    private String name;
    @Column(name = "last_name", length = 45)
    private String last_name;
    @Column(name = "club", length = 45)
    private String club;
    @Column(name = "date_birth", length = 45)
    private String date_birth;
    @Column(name = "position", length = 45)
    private String position;
    @Column(name = "n_shirt", length = 45)
    private String n_shirt;
    @Column(name = "n_goals", length = 45)
    private String n_goals;

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

    public String getDate_birth() {
        return date_birth;
    }

    public void setDate_birth(String date_birth) {
        this.date_birth = date_birth;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getN_shirt() {
        return n_shirt;
    }

    public void setN_shirt(String n_shirt) {
        this.n_shirt = n_shirt;
    }

    public String getN_goals() {
        return n_goals;
    }

    public void setN_goals(String n_goals) {
        this.n_goals = n_goals;
    }
}
