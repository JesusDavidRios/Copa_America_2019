package com.project.controller;

import com.project.Constants;
import com.project.dto.PlayerDto;
import com.project.facade.PlayerFacade;
import com.project.facade.TeamFacade;
import com.project.model.PlayerModel;
import com.project.model.TeamModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/player")
public class PlayerController {

    // logging :: https://www.baeldung.com/spring-http-logging

    // llamados a facades
    @Autowired
    private PlayerFacade playerFacade;
    @Autowired
    private PlayerDto playerDto;

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model,
                           @ModelAttribute("player") TeamModel teamModel) {
        //teamFacade.save(team);
        model.addAttribute("player", name);
        return Constants.Templates.PLAYER;
    }

    @RequestMapping("/all")
    public String listAll(Model model) {
        model.addAttribute("player", playerFacade.listAll());
        model.addAttribute("name", "Jesus");
        return Constants.Templates.PLAYER;
    }

    @RequestMapping(value = "/id/{id}/team/{teamId}", method = RequestMethod.GET)
    public String updateTeamPlayer(Model model, @PathVariable int id, @PathVariable int teamId)
    {
        //DTO
        /*
        metodo updateTeamPlayer debe devolver DTO (1)
        playerDTO agregarlo al modelo
         */
        final List<PlayerModel> list = playerFacade.updateTeamPlayer(id, teamId);
        model.addAttribute("player", list);
        model.addAttribute("name", "Jesus");
        return Constants.Templates.PLAYER;
    }

    @RequestMapping(value = "/id/{id}", method = RequestMethod.GET)
    public String updateTeamPlayer(Model model, @PathVariable int id)
    {
        //DTO
        /*
        metodo updateTeamPlayer debe devolver DTO (1)
        playerDTO agregarlo al modelo
         */
        final PlayerDto playerDtoRTA = playerFacade.showTeamPlayer(id);
        model.addAttribute("player", playerDtoRTA);
        model.addAttribute("name", "Jesus");
        return Constants.Templates.PLAYERDTO;
    }

    @RequestMapping("/find")
    public String findByName(@RequestParam(required = true, name = "name") String playerName, Model model) {
        model.addAttribute("player",playerFacade.findByName(playerName));
        return Constants.Templates.PLAYER;
    }

}
