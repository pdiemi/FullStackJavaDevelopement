package com.model;

import org.springframework.stereotype.Component;

@Component
public class WelcomeImpl implements WelcomeDAO{

	@Override
	public String sayWelcom(String name) {
		return "Welcome " + name;
		
	}

}
