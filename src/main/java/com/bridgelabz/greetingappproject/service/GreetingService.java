package com.bridgelabz.greetingappproject.service;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.greetingappproject.model.Greeting;
import com.bridgelabz.greetingappproject.model.User;
import com.bridgelabz.greetingappproject.repository.GreetingRepository;

@Service
public class GreetingService implements IGreetingService{
	private static final String template ="Hello %s";
	private final AtomicLong counter = new AtomicLong();

	@Autowired
	private GreetingRepository greetingRepository;
	
	@Override
	public Greeting addGreeting(User user) {
		String message = String.format(template,(user.toString().isEmpty())?"Hello Wold":user.toString());
		return greetingRepository.save(new Greeting(counter.incrementAndGet(),message));
	}

	@Override
	public Greeting getGreetingById(long id) {
		return greetingRepository.findById(id).get();
	}

}
