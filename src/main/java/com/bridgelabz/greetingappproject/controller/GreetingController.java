package com.bridgelabz.greetingappproject.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.greetingappproject.model.Greeting;
import com.bridgelabz.greetingappproject.model.User;
import com.bridgelabz.greetingappproject.service.IGreetingService;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
	private static String template = "Hello ,%s!"
	private final AtomicLong counter = new AtomicLong();

	@Autowired
	private IGreetingService greetingService;

	@GetMapping(value= {"","/","/greeting"})
	public Greeting greeting(@RequestParam(value="name",defaultValue="World") String name) {
		User user = new User();
		user.setfirstName(name);
		return greetingService.addGreeting(user);
	}
}
