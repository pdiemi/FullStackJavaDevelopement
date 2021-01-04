package com.model;

import org.springframework.stereotype.Component;

@Component
public class WelcomeImpl implements WelcomeDAO{

	@Override
	public String sayWelcom(String name) {
		return "Welcome " + name;
		
	}

	@Override
	public void sayHi(String name, String email) {
		System.out.print("Hi "+name+"! Your eamil is "+email+"\n");
		
	}

	@Override
	public void sayAround() {
		System.out.print("I just swing by\n");
		
	}

}
