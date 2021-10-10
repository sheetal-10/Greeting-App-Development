package com.bridgelabz.GreetingApp.controller;

import com.bridgelabz.GreetingApp.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @Autowired
    GreetingService greetingService;

    @GetMapping
    public String greeting() {
        return "Welcome to our Greeting App ";
    }

    @GetMapping("/{name}")
    public String greeting(@PathVariable String name) {
        return "Hello " + name + ". Welcome to our Greeting App ";
    }

    @GetMapping("/greeting")
    public String greetingService(){
        return greetingService.helloGreeting();
    }

}
