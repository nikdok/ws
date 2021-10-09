package com.ws.worldskills.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String signInPage(Model model) {

        return "login";
    }

    @GetMapping("/registration")
    public String signUpPage(Model model) {

        return "registration";
    }

}
