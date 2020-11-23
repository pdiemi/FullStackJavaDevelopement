package miniapp;

import java.io.FileNotFoundException;

public class Client {

	public static void main(String[] args) {
		Emp emp = new Emp("Alex", "Austin");
		Employee e = new EmployeeImpl();
		
		try {
			e.addEmployee(emp);
		} catch (UserException e1) {
			// TODO Auto-generated catch block
			//e1.printStackTrace();
			System.out.println(e1.getMessage());
		}
		//System.out.println("emp is added");
	}

}
