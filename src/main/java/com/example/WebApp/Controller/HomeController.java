package com.example.WebApp.Controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {


    @RequestMapping("/")
    public String greet(){

        return "welcome to my web app";
    }
}
