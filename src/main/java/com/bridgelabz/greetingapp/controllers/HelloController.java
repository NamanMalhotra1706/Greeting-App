package com.bridgelabz.greetingapp.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping(value = {"/query"}, method = RequestMethod.GET) // Old method
    public String hello(@RequestParam String name) {
        return "<h1> Hello " + name +"</h1>" ;
    }
}
