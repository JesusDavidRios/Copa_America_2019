package com.project.rest;

import com.project.dao.PlayerDao;
import com.project.model.PlayerModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/player")
public class PlayerRest {

    @Autowired
    private PlayerDao playerDao;

    @GetMapping
    public List<PlayerModel> listAll() {
        return this.playerDao.findAll();
    }

    @PostMapping
    public void insert(@RequestBody PlayerModel playerModel) {
        this.playerDao.save(playerModel);
    }

    @PutMapping
    public void update(@RequestBody PlayerModel playerModel) {
        this.playerDao.save(playerModel);
    }

    @DeleteMapping
    public void delete(@RequestBody PlayerModel playerModel) {
        this.playerDao.delete(playerModel);
    }
}
