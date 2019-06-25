package com.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "team")
public class TeamModel {

    @Id
    private int id;
    @Column(name = "name", length = 45)
    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


/*

    public void setNombre(String name) {
        this.name = name;
    }



    public void setId(int id) {
        this.id = id;
    }*/
}
