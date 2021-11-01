package com.bridgelabz.greetingappproject.model;

public class Greeting {
	private long GreetingId;
	private String name;

	public Greeting(long incrementAndGet,String name) {
		setGreeting(incrementAndGet);
		setName(name);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long  getGreeting() {
		return GreetingId;
	}
	public void setGreeting(long greetingId) {
		this.GreetingId = greetingId;
	}
}
