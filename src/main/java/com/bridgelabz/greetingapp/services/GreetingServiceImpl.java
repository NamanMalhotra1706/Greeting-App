package com.bridgelabz.greetingapp.services;

import com.bridgelabz.greetingapp.models.Greeting;
import com.bridgelabz.greetingapp.repositories.IGreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    @Override
    public void deleteGreetingById(long greetingId) {
         greetingRepository.deleteById(greetingId);
    }

    @Override
    public boolean updateGreetingById(Long id, String newMessage) {
        Optional<Greeting> optionalGreeting = greetingRepository.findById(id);
        if (optionalGreeting.isPresent()) {
            Greeting greeting = optionalGreeting.get();
            greeting.setMessage(newMessage); // update message (Setter in Greeting Model)
            greetingRepository.save(greeting); // save updated entity
            return true;
        }
        return false;
    }

}