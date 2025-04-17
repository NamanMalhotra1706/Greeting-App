package com.bridgelabz.greetingapp.services;

import com.bridgelabz.greetingapp.models.Greeting;

import java.util.List;

public interface IGreetingService {
    Greeting saveGreeting(String message);
    List<Greeting> getAllGreetings();
}
