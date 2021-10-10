package com.bridgelabz.GreetingApp.controller;

import com.bridgelabz.GreetingApp.entity.Greeting;
import com.bridgelabz.GreetingApp.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping(value = "/greeting1")
    public String greeting1(@RequestParam String fname, @RequestParam String lname) {
        return "Hello : " + fname + " " + lname;
    }

    @GetMapping(value = "/greetings")
    public List<Greeting> greetings() {
        return greetingService.greetings();
    }

    @PostMapping("/addGreeting")
    public Greeting addGreeting(@RequestBody Greeting greeting) {
        return greetingService.addGreeting(greeting);
    }

    @PutMapping(value = "/updateGreeting")
    public Greeting updateGreeting(@RequestBody Greeting greeting) {
        return greetingService.updateGreeting(greeting);
    }

    @DeleteMapping(value = "/deleteGreeting")
    public String deleteGreeting(@RequestParam int id) {
        return greetingService.deleteGreeting(id);
    }
}
