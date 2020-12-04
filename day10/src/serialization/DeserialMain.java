package serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserialMain {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream fis = new FileInputStream("data.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Employee emp = (Employee)ois.readObject();
		System.out.println(emp);

	}

}
