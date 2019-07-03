package com.project.controller;

import com.project.Constants;
import com.project.dao.UserDao;
import com.project.facade.UserFacade;
import com.project.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserFacade userFacade;

    /*@Autowired
    private BCryptPasswordEncoder encoder;
    */

   /* @Autowired
    private UserModel userModel;
    */

    public String login(Model model) {
        return Constants.Templates.PLAYER;
    }

    @RequestMapping(value = "/id/{id}/name/{name}/pass/{pass}/level/{level}", method = RequestMethod.GET)
    public String createUser(Model model, @PathVariable int id, @PathVariable String name, @PathVariable String pass, @PathVariable String level) {

        UserModel userModelRTA = userFacade.create(id, name, pass, level);
        /*UserModel userModelRTA = userFacade.create(id, name, pass, level, encoder);*/
        model.addAttribute("user", userModelRTA);
        model.addAttribute("name", "Jesus");
        return Constants.Templates.USER;
    }

    @RequestMapping("/all")
    public String listAll(Model model) {
        model.addAttribute("user", userFacade.listAll());
        model.addAttribute("name", "Juan");
        return Constants.Templates.USER;

    }

}
