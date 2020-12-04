package serialization;

import java.io.Serializable;

public class Employee implements Serializable{

	private String empName;
	private double empIncome;
	private String empEmail;
	private String empState; 
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String empName, double empIncome, String empEmail, String empState) {
		super();
		this.empName = empName;
		this.empIncome = empIncome;
		this.empEmail = empEmail;
		this.empState = empState;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empIncome=" + empIncome + ", empEmail=" + empEmail + ", empState="
				+ empState + "]";
	}

	
	
}
