package serialization;

import java.io.Serializable;

public class Employee implements Serializable{

	private String empName;
	private String empEmail;
	/* transient keyword excludes the variable from 
	 * being written to user file system
	 */
	private transient String empCity; 
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String empName, String empEmail, String empCity) {
		super();
		this.empName = empName;
		this.empEmail = empEmail;
		this.empCity = empCity;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empEmail=" + empEmail + ", empCity=" + empCity + "]";
	}
	
	
}
