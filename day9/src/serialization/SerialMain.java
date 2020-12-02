package serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerialMain {

	public static void main(String args[]) throws IOException {
		Employee emp = new Employee("Diemi","diemi@hcl.com", "Austin");
		
		System.out.println(emp);
		FileOutputStream fos = new FileOutputStream("data.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(emp);
	}
}
