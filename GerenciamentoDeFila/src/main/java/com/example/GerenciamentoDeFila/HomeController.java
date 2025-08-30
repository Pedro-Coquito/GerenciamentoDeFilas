package com.example.GerenciamentoDeFila;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/dashboard")
    public String login(){
        return "dashboard";
    }
}
