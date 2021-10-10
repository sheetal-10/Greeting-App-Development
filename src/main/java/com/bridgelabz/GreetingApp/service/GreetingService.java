package com.bridgelabz.GreetingApp.service;

import com.bridgelabz.GreetingApp.entity.Greeting;
import com.bridgelabz.GreetingApp.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GreetingService {

    @Autowired
    GreetingRepository greetingRepository;

    public String helloGreeting() {
        return "Hello Sheetal";
    }

    public List<Greeting> greetings() {
        return greetingRepository.findAll();
    }

    public Greeting addGreeting(Greeting greeting) {
        return greetingRepository.save(greeting);
    }

    public Greeting updateGreeting(Greeting greeting) {
        return greetingRepository.save(greeting);
    }

    public String deleteGreeting(int id) {
        Optional<Greeting> greeting = greetingRepository.findById(id);
        if (greeting.isPresent()) {
            greetingRepository.delete(greeting.get());
            return "Record deleted successfully";
        }
        return "Record does not exists with this id : " + id;
    }

    public Greeting getGreetingById(int id) {
        Optional<Greeting> greeting = greetingRepository.findById(id);
        if (greeting.isPresent()) {
            return greeting.get();
        }
        return null;
    }
}
