package org.example.backend.Services;

import org.example.backend.Models.User;
import org.springframework.stereotype.Service;

@Service
public class ExampleService {

    public String SayHello(){
        return "Hello from Example Service";
    }

    public User CreateUser(String name){

        var user = new User();
        user.Name = name;
        var string = user.toString();

        return user;
    }

    public String SubmitName(String name) {
        return name +"touched the service";
    }
}
