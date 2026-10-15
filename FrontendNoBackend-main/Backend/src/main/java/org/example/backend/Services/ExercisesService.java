package org.example.backend.Services;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class ExercisesService {

    private final Random _random = new Random();

    public String Hello(){
        return "Hello from Exercises";
    }

    public int RandomNumber(){
        // nextInt(100) giver 0-99, så vi lægger 1 til for at få 1-100
        return _random.nextInt(100) + 1;
    }

    public boolean IsOnline(){
        return true;
    }

    public String Echo(String message){
        return message;
    }

    public int Add(int a, int b){
        return a + b;
    }

    public double Divide(int a, int b){
        // Cast a til double, ellers bliver det heltalsdivision (7 / 2 = 3)
        return (double) a / b;
    }
}
