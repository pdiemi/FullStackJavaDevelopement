package com.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;

@Lazy
public class CurrentAccount implements InterestCalculator{

	@Value("4.5")
	private double roi;
	@Value("5")
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

	public double getRoi() {
		return roi;
	}

	public void setRoi(double roi) {
		this.roi = roi;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public double calculate(double amount) {
		// TODO Auto-generated method stub
		return roi*duration/amount;
	}
	

}
