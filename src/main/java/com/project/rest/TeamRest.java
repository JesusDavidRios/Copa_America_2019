package com.project.rest;

import com.project.model.TeamModel;
import com.project.dao.team.TeamDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/team")
public class TeamRest {
    @Autowired
    private TeamDao team;

    @GetMapping
    public List<TeamModel> listAll(){
        return this.team.findAll();
    }

    @PostMapping
    public void insert(@RequestBody TeamModel teamModel){
        this.team.save(teamModel);
    }

    @PutMapping
    public void update(@RequestBody TeamModel teamModel){
        this.team.save(teamModel);
    }

    @DeleteMapping(value="/{id}")
    public void delete(@PathVariable("id") Integer id){
        this.team.deleteById(id);
    }
}
