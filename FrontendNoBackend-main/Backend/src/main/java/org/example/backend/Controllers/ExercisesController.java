package org.example.backend.Controllers;

import org.example.backend.Services.ExercisesService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api/exercises")
@CrossOrigin(origins = "http://localhost:4200")
public class ExercisesController {

    public ExercisesService _exercisesService;

    public ExercisesController(ExercisesService _exercisesService) {
        this._exercisesService = _exercisesService;
    }

    // ---------- GET ----------

    @GetMapping("/hello")
    public String Hello() {
        return _exercisesService.Hello();
    }

    @GetMapping("/random-number")
    public int RandomNumber() {
        return _exercisesService.RandomNumber();
    }

    @GetMapping("/is-online")
    public boolean IsOnline() {
        return _exercisesService.IsOnline();
    }

    // ---------- POST ----------

    @PostMapping("/echo/{message}")
    public String Echo(@PathVariable String message) {
        return _exercisesService.Echo(message);
    }

    @PostMapping("/add/{a}/{b}")
    public int Add(@PathVariable int a, @PathVariable int b) {
        return _exercisesService.Add(a, b);
    }

    @PostMapping("/divide/{a}/{b}")
    public double Divide(@PathVariable int a, @PathVariable int b) {
        if (b == 0) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Cannot divide by zero");
        }
        return _exercisesService.Divide(a, b);
    }
}
