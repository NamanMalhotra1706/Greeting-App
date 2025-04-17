package com.bridgelabz.greetingapp.controllers;

import com.bridgelabz.greetingapp.models.Greeting;
import com.bridgelabz.greetingapp.services.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;

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

    @DeleteMapping("/delete/{greetingId}")
    public String deleteGreeting(@PathVariable long greetingId) {
        greetingService.deleteGreetingById(greetingId);

        return "Greeting deleted";
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<String> updateGreeting(@PathVariable Long id, @RequestBody String newMessage) {
        boolean updated = greetingService.updateGreetingById(id, newMessage);
        if (updated) {
            return ResponseEntity.ok("Greeting updated successfully!");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Greeting not found with ID: " + id);
        }
    }

}
