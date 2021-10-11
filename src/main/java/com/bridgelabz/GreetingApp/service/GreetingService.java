package com.bridgelabz.GreetingApp.service;

import com.bridgelabz.GreetingApp.entity.Greeting;
import com.bridgelabz.GreetingApp.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Layer contains business logic,
 * It implements all the methods in controller layer
 * @author - Sheetal Panda
 * @version - 0.0.1
 * @since - 10/10/2021
 */
@Service
public class GreetingService {

    @Autowired
    GreetingRepository greetingRepository;

    public String helloGreeting() {
        return "Hello Sheetal";
    }

    /**
     * Function to get the list of greetings stored in database
     * @return list of greetings
     */
    public List<Greeting> greetings() {
        return greetingRepository.findAll();
    }

    /**
     * Function to add greetings and save greetings to the database
     * @param greeting greeting data from client
     * @return greeting messages added
     */
    public Greeting addGreeting(Greeting greeting) {
        return greetingRepository.save(greeting);
    }

    /**
     * Function to edit the available greeting in the database
     * @param greeting greeting data from client
     * @return updated greeting message
     */
    public Greeting updateGreeting(Greeting greeting) {
        return greetingRepository.save(greeting);
    }

    /**
     * Function to particular greeting message from database and delete it
     * @param id unique id of the greeting
     * @return String message displaying status of operation
     */
    public String deleteGreeting(int id) {
        Optional<Greeting> greeting = greetingRepository.findById(id);
        if (greeting.isPresent()) {
            greetingRepository.delete(greeting.get());
            return "Record deleted successfully";
        }
        return "Record does not exists with this id : " + id;
    }

    /**
     * Function to get a particular greeting stored in database
     * @param id unique id of the greeting message
     * @return greeting with the unique id
     */
    public Greeting getGreetingById(int id) {
        Optional<Greeting> greeting = greetingRepository.findById(id);
        if (greeting.isPresent()) {
            return greeting.get();
        }
        return null;
    }
}
