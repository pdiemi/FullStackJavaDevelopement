package jbdcdemo;

public class Employee {

	private String empName;
	private String empEmail;
	private String empCity;
	
	public Employee(String empName, String empEmail, String empCity) {
		super();
		this.empName = empName;
		this.empEmail = empEmail;
		this.empCity = empCity;
	}

	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}

	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	/**
	 * @return the empEmail
	 */
	public String getEmpEmail() {
		return empEmail;
	}

	/**
	 * @param empEmail the empEmail to set
	 */
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	/**
	 * @return the empCity
	 */
	public String getEmpCity() {
		return empCity;
	}

	/**
	 * @param empCity the empCity to set
	 */
	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empEmail=" + empEmail + ", empCity=" + empCity + "]";
	}
	
	
}
