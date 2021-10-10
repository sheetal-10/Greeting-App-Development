package com.bridgelabz.GreetingApp.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Greeting {
    @Id
    private int id;
    private String message;

}
