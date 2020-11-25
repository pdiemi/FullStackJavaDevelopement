package collectiondemos;

public class Employee implements Comparable<Employee> {

	private int empId;
	private String empName;
	private String empCity;
	
	public Employee(int empId, String empName, String empCity) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empCity = empCity;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empCity=" + empCity + "]";
	}

	@Override
	public int compareTo(Employee emp) {
		// TODO Auto-generated method stub
		return this.empId - emp.empId;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empCity == null) ? 0 : empCity.hashCode());
		result = prime * result + empId;
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empCity == null) {
			if (other.empCity != null)
				return false;
		} else if (!empCity.equals(other.empCity))
			return false;
		if (empId != other.empId)
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		return true;
	}

}
