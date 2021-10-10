package com.bridgelabz.GreetingApp.service;

import com.bridgelabz.GreetingApp.entity.Greeting;
import com.bridgelabz.GreetingApp.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GreetingService {

    @Autowired
    GreetingRepository greetingRepository;

    public String helloGreeting(){
        return "Hello Sheetal";
    }

    public List<Greeting> greetings() {
        return greetingRepository.findAll();
    }

    public Greeting addTeachers(Greeting greetingEntity) {
        return greetingRepository.save(greetingEntity);
    }
}
