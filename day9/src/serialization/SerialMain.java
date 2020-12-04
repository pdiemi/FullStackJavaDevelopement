package serialization;

import emailvalidation.EmailValidation;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class SerialMain {

	public static void main(String args[]) throws IOException {
		
		String name, email, state;
		double income;
		Scanner scan = new Scanner(System.in);
		System.out.print("Name: ");
		name = scan.next();
		do {
			System.out.print("Income (must be whole number less than 99,999,999): ");
			income = scan.nextDouble();
		} while (income>99999999); //TODO: check whole number
		
		do {
			System.out.print("Email (example@email.com): ");
			email = scan.next();
		} while ();
		
		Employee emp = new Employee("Diemi","diemi@hcl.com", "Austin");
		
		System.out.println(emp);
		FileOutputStream fos = new FileOutputStream("data.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(emp);
	}
}
