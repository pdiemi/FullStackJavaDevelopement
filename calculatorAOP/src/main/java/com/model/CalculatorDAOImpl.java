package com.model;

import org.springframework.stereotype.Component;

@Component
public class CalculatorDAOImpl implements CalculatorDAO{

	@Override
	public void add(int x, int y) {
		System.out.println(x + " + " + y + " = " + (x+y));
		
	}

	@Override
	public void sub(int x, int y) {
		System.out.println(x + " - " + y + " = " + (x-y));
		
	}

	@Override
	public void multiply(int x, int y) {
		System.out.println(x + " * " + y + " = " + (x*y));
		
	}

	

}
