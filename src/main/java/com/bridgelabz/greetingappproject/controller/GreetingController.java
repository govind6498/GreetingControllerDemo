package com.bridgelabz.greetingappproject.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.greetingappproject.model.User;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
	private static final String template = "Hello,%s!";

	@RequestMapping(value= {"","/","/home"})
	public String sysHello() {
		return String.format(template,"Wolrd");
	}
	@GetMapping("/query")
	public String greeting(@RequestParam(value="name",defaultValue="World") String name) {
		return String.format(template, name);
	}
	@PostMapping("/post")
	public String greeting(@RequestBody User user) {
		return String.format(template, user.getFirstName()+" "+user.getLastName());
	}
	@PutMapping("put/{firstName}")
	public String greeting(@PathVariable String firstName,@RequestParam(value="lastName") String lastName){
		return String.format(template,firstName+" "+lastName);
	}
}
