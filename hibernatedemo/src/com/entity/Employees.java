package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity  //convert class into a table
public class Employees {

	@Id  //set following member (empId) as primary key
	private int empId;
	private String empName;
	private String empCity;
	
	@Override
	public String toString() {
		return "Employees [empId=" + empId + ", empName=" + empName + ", empCity=" + empCity + "]";
	}

	public Employees() {
		super();
	}

	public Employees(int empId, String empName, String empCity) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empCity = empCity;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpCity() {
		return empCity;
	}

	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}
	
}
