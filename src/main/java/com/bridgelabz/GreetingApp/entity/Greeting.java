package com.bridgelabz.GreetingApp.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Layer that contains the entities in the database
 * @author - Sheetal Panda
 * @version - 0.0.1
 * @since - 10/10/2021
 */
@Data
@Entity
public class Greeting {
    @Id
    private int id;
    private String message;

}
