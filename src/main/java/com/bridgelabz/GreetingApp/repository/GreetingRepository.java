package com.bridgelabz.GreetingApp.repository;

import com.bridgelabz.GreetingApp.entity.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreetingRepository extends JpaRepository<Greeting, Integer> {
}
