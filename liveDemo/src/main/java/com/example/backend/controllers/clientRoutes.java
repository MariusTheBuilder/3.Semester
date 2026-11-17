package com.example.backend.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:5173")
public class clientRoutes {

    private String something;

    @GetMapping("/hello")
    public String hello(username, password) {

        String something;

        usernameCorrect = database.checkusername(username);
        passwordCorrect = database.checkPassword(username, password);

        if (usernameCorrect && passwordCorrect){
            return "/homepage";
        }


        something = "hullo";

        this.something = "Hello";

        return "Hello from Spring Boot!";
    }
}