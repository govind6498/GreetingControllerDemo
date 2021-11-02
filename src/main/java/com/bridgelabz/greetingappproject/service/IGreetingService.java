package com.bridgelabz.greetingappproject.service;

import com.bridgelabz.greetingappproject.model.Greeting;
import com.bridgelabz.greetingappproject.model.User;

public interface IGreetingService {
	Greeting addGreeting(User user);
	Greeting getGreetingById(long id);
}
