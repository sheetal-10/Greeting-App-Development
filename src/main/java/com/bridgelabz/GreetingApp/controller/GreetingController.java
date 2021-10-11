package com.bridgelabz.GreetingApp.controller;

import com.bridgelabz.GreetingApp.entity.Greeting;
import com.bridgelabz.GreetingApp.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * Layer that receives various HTTP request from client
 * @author - Sheetal Panda
 * @version - 0.0.1
 * @since - 10/10/2021
 */
@RestController
public class GreetingController {

    @Autowired
    GreetingService greetingService;

    /**
     * Function to show greeting message
     * @return message
     */
    @GetMapping
    public String greeting() {
        return "Welcome to our Greeting App ";
    }

    /**
     * Function to get mapping from client
     * @return greeting
     */
    @GetMapping("/{name}")
    public String greeting(@PathVariable String name) {
        return "Hello " + name + ". Welcome to our Greeting App ";
    }

    /**
     * Function to get mapping from client
     * @return greeting with first name and last name
     */
    @GetMapping(value = "/greeting1")
    public String greeting1(@RequestParam String fname, @RequestParam String lname) {
        return "Hello : " + fname + " " + lname;
    }

    /**
     * Function to get mapping from client
     * @return greeting
     */
    @GetMapping(value = "/greetings")
    public List<Greeting> greetings() {
        return greetingService.greetings();
    }

    /**
     * Function to receive get request from client
     * @param greeting greeting data from client
     * @return added greetings in the database
     */
    @PostMapping("/addGreeting")
    public Greeting addGreeting(@RequestBody Greeting greeting) {
        return greetingService.addGreeting(greeting);
    }

    /**
     * Function to receive put request from client
     * @param greeting  greeting data from client
     * @return updated greetings in the database
     */
    @PutMapping(value = "/updateGreeting")
    public Greeting updateGreeting(@RequestBody Greeting greeting) {
        return greetingService.updateGreeting(greeting);
    }

    /**
     * Function to delete greeting from client
     * @param id unique id of the greeting
     * @return String message displaying status of operation
     */
    @DeleteMapping(value = "/deleteGreeting")
    public String deleteGreeting(@RequestParam int id) {
        return greetingService.deleteGreeting(id);
    }

    /**
     * Function to post request from client
     * @param id unique id of the greeting
     * @return greeting message with the unique id
     */
    @GetMapping(value = "/getGreetingById")
    public Greeting getGreetingById(@RequestParam int id) {
        return greetingService.getGreetingById(id);
    }
}
