package miniapp;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class EmployeeImpl implements Employee {

	@Override
	public void addEmployee(Emp e) throws UserException {
		
			try {
				FileOutputStream fos = new FileOutputStream("c:\\");
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				//e1.printStackTrace();
				throw new UserException("Something went wrong, please try again later", e1);
			}
	}

	
}
