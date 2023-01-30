package com.example.data.penduduk.Data.Penduduk.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
    
    @GetMapping("/login")
    public String welcomeController(){
        return "login";
    }

    @GetMapping("/home")
    public String homeController(){
        return "index";
    }
}
