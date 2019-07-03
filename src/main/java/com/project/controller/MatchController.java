package com.project.controller;

import com.project.facade.MatchFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/match")
public class MatchController {

    @Autowired
    private MatchFacade matchFacade;
}
