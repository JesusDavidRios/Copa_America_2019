package com.project.rest;

import com.project.dao.MatchDao;
import com.project.model.MatchModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/match")
public class MatchRest {
    @Autowired
    private MatchDao matchDao;

    @GetMapping
    public List<MatchModel> listAll(){
        return this.matchDao.findAll();
    }

    @PostMapping
    public void insert(@RequestBody MatchModel matchModel){
        this.matchDao.save(matchModel);
    }

    @PutMapping
    public void update(@RequestBody MatchModel matchModel){
        this.matchDao.save(matchModel);
    }

    @DeleteMapping(value="/id/{id}")
    public void delete(@PathVariable("id") Integer id){
        this.matchDao.deleteById(id);
    }

}
