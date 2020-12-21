package com.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity  //convert class into a table
public class Employees {

	@OneToOne (cascade = CascadeType.ALL)
	private Address empAddress;
	
	public Address getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(Address empAddress) {
		this.empAddress = empAddress;
	}

	public Employees(Address empAddress, int empId, String empName, String empCity) {
		super();
		this.empAddress = empAddress;
		this.empId = empId;
		this.empName = empName;
		this.empCity = empCity;
	}

	@Id  //set following member (empId) as primary key
	private int empId;
	private String empName;
	private String empCity;
	
	
	@Override
	public String toString() {
		return "Employees [empId=" + empId + ", empName=" + empName + ", empCity="
				+ empCity + ", empAddress=" + empAddress + "]";
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
