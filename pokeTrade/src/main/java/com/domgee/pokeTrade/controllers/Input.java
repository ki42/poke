package com.domgee.pokeTrade.controllers;

import com.domgee.pokeTrade.models.data.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "")
public class Input {

    @Autowired
    UserDao userDao;

    @RequestMapping(value = "")
    public String index(Model model) {
        model.addAttribute("title", "User Sign in");
        return "index";
    }
}
