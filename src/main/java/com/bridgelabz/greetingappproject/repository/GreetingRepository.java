package com.bridgelabz.greetingappproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bridgelabz.greetingappproject.model.Greeting;

public interface GreetingRepository extends JpaRepository<Greeting, Long> {

}