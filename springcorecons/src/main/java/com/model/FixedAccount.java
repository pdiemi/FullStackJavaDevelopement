package com.model;

public class FixedAccount implements InterestCalculator{

	private double roi;
	private int duration;
	
	public FixedAccount() {
		super();
		System.out.println("inside FDA");
	}
	
	public FixedAccount(double roi, int duration) {
		super();
		this.roi = roi;
		this.duration = duration;
	}

	@Override
	public double calculate(double amount) {
		// TODO Auto-generated method stub
		return roi*duration/amount;
	}
	
	
}
