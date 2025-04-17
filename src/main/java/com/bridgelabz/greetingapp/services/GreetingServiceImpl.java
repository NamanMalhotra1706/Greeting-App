package com.bridgelabz.greetingapp.services;

import com.bridgelabz.greetingapp.models.Greeting;
import com.bridgelabz.greetingapp.repositories.IGreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GreetingServiceImpl implements IGreetingService {

    @Autowired
    private IGreetingRepository greetingRepository;

    @Override
    public Greeting saveGreeting(String message) {
        Greeting greeting = new Greeting(message);
        return greetingRepository.save(greeting);
    }

    @Override
    public List<Greeting> getAllGreetings() {
        return greetingRepository.findAll();
    }
}