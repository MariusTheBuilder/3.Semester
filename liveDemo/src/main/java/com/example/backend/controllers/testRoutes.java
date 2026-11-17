
package com.example.backend.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:5173")
public class testRoutes {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Spring Boot!";
    }
}


