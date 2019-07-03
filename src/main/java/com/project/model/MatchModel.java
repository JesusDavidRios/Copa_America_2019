package com.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="match")
public class MatchModel {
    @Id
    private int id;
    @Column(name = "idlocal")
    private int idLocal;
    @Column(name = "idvisitor")
    private int idVisitor;
    @Column(name = "scorelocal")
    private String scoreLocal;
    @Column(name = "scorevisitor")
    private String scoreVisitor;
    @Column(name = "date_match")
    private String date_match;
    @Column(name = "idstadium")
    private int idStadium;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdLocal() {
        return idLocal;
    }

    public void setIdLocal(int idLocal) {
        this.idLocal = idLocal;
    }

    public int getIdVisitor() {
        return idVisitor;
    }

    public void setIdVisitor(int idVisitor) {
        this.idVisitor = idVisitor;
    }

    public String getScoreLocal() {
        return scoreLocal;
    }

    public void setScoreLocal(String scoreLocal) {
        this.scoreLocal = scoreLocal;
    }

    public String getScoreVisitor() {
        return scoreVisitor;
    }

    public void setScoreVisitor(String scoreVisitor) {
        this.scoreVisitor = scoreVisitor;
    }

    public String getDate_match() {
        return date_match;
    }

    public void setDate_match(String date_match) {
        this.date_match = date_match;
    }

    public int getIdStadium() {
        return idStadium;
    }

    public void setIdStadium(int idStadium) {
        this.idStadium = idStadium;
    }
}
