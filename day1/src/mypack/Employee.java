package mypack;

public class Employee {

	public Employee(String empID, String empName, int income, String department) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.income = income;
		this.department = department;
	}
	public Employee() {
		super();
	}
	private String empID;
	private String empName;
	private int income;
	private String department;
	public String getEmpID() {
		return empID;
	}
	public void setEmpID(String empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + ", income=" + income + ", department=" + department
				+ "]";
	}
	
	
	
}
