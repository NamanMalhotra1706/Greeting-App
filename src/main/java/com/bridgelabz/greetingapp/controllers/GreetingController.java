package com.bridgelabz.greetingapp.controllers;

import com.bridgelabz.greetingapp.models.Greeting;
import com.bridgelabz.greetingapp.services.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @Autowired
    private IGreetingService greetingService;

//    @PostMapping("/add")
//    public Greeting addGreeting(@RequestParam String message) {
//        return greetingService.saveGreeting(message);
//    }

    @PostMapping("/add")
    public Greeting addGreeting(@RequestBody String message) {
        return greetingService.saveGreeting(message);
    }

    @GetMapping("/all")
    public List<Greeting> getGreetings() {
        return greetingService.getAllGreetings();
    }
}
