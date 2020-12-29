package com.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import com.model.InterestCalculator;

public class CalculatorService {

	private InterestCalculator ic;
	
	public double service(double amount) {
		return ic.calculate(amount);
	}

	public CalculatorService() {
		super();
		System.out.println("inside service");
	}
	
	public CalculatorService(InterestCalculator ic) {
		super();
		this.ic = ic;
	}

	@PostConstruct
	public void init() {
		System.out.println("insdie init");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("inside destroy");
	}
}
