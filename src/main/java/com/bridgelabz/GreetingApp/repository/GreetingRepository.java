package com.bridgelabz.GreetingApp.repository;

import com.bridgelabz.GreetingApp.entity.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Layer that implements interface and does the database operations
 * @author - Sheetal Panda
 * @version - 0.0.1
 * @since - 10/10/2021
 */
@Repository
public interface GreetingRepository extends JpaRepository<Greeting, Integer> {
}
