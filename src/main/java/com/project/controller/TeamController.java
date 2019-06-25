package com.project.controller;

import com.project.Constants;
import com.project.facade.TeamFacade;
import com.project.model.TeamModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/team")
public class TeamController {

    // llamados a facades
    @Autowired
    private TeamFacade teamFacade;

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model,
                           @ModelAttribute("team") TeamModel teamModel) {
        //teamFacade.save(team);
        model.addAttribute("name", name);
        return Constants.Templates.TEAM;
    }

    @RequestMapping("/all")
    public String listAll(Model model) {
        model.addAttribute("team", teamFacade.listAll());
        model.addAttribute("name", "Juan");
        return Constants.Templates.TEAM;
    }

    @RequestMapping("/find")
    public String findByName(@RequestParam(required = true, name = "name") String teamName, Model model) {
        model.addAttribute("team",teamFacade.findByName(teamName));
        return Constants.Templates.TEAM;
    }

}
