package com.project.rest;

import com.project.dao.team.PlayerDao;
import com.project.model.PlayerModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/player")
public class PlayerRest {

    @Autowired
    private PlayerDao playerDao;

    @PostMapping("/all")
    private List<PlayerModel> listAll() {
        return this.playerDao.findAll();
    }

    @PostMapping
    private void insert(@RequestBody PlayerModel playerModel) {
        this.playerDao.save(playerModel);
    }

    @PutMapping
    private void update(@RequestBody PlayerModel playerModel) {
        this.playerDao.save(playerModel);
    }

    @DeleteMapping
    private void delete(@RequestBody PlayerModel playerModel) {
        this.playerDao.delete(playerModel);
    }
}
