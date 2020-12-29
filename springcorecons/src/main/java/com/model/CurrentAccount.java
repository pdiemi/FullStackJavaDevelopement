package com.model;

public class CurrentAccount implements InterestCalculator{

	private double roi;
	private int duration;
	
	public CurrentAccount() {
		super();
		System.out.println("inside CRA");
	}
	
	public CurrentAccount(double roi, int duration) {
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
