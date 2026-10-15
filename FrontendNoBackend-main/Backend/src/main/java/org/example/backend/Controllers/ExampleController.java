package org.example.backend.Controllers;

import org.example.backend.Models.User;
import org.example.backend.Services.ExampleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpServerErrorException;

@RestController
@Controller
@RequestMapping("/api/example")
@CrossOrigin(origins = "http://localhost:4200")
public class ExampleController {

    private final ExampleService exampleService;
    public ExampleService _exampleService;

    public ExampleController(ExampleService _exampleService, ExampleService exampleService) {
        this._exampleService = _exampleService;
        this.exampleService = exampleService;
    }

    @GetMapping
    public String Index(){
        return "GetIndex";
    }

    @GetMapping("/greeting")
    public String greeting() {
        var message = _exampleService.SayHello();
        if(message == null){
            throw new RuntimeException("Didnt get message");
        }
        return message;
    }

    @PostMapping("/create-user/{name}")
    public User CreateUser(@PathVariable String name) {
        var user = _exampleService.CreateUser(name);
        return user;
    }

    @PostMapping("/submit-name/{name}")
    public String SubmitName(@PathVariable String name) {
        var returnedString = _exampleService.SubmitName(name);
        return returnedString;
    }

}

