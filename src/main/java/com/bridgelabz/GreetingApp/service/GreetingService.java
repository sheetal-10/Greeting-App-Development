package com.bridgelabz.GreetingApp.service;

import com.bridgelabz.GreetingApp.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public String helloGreeting(){
        return "Hello Sheetal";
    }


}
