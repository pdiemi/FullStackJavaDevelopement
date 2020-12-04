package serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.regex.Pattern;

public class SerialMain {
	
	public static final String REGEX_NAME   = "[A-Za-z]+";
	public static final String REGEX_EMAIL  = "^[A-Za-z0-9]+[A-Za-z0-9_.-]*[A-Za-z0-9]+" +
			   								  "@[A-Za-z0-9]+[A-Za-z0-9.]+[A-Za-z0-9]+$";
	public static final String REGEX_INCOME = "[0-9]{1,8}";
	public static final String REGEX_STATE  = "[A-Za-z]{2,3}";
	
	public static boolean validate(String input, String regex) {
		if (input.isEmpty())
			return false;
		else {
			Pattern pattern = Pattern.compile(regex);
			return pattern.matcher(input).matches();
		}
	}

	public static void main(String args[]) throws IOException {
		
		String name, email, state;
		String income;
		Scanner scan = new Scanner(System.in);
		
		//validate name
		System.out.print("Name: ");
		name = scan.next();
		while (!validate(name, REGEX_NAME)) {
			System.out.println("Please enter a valid name!");
			System.out.print("Name: ");
			name = scan.next();
		}
		
		//validate income
		System.out.print("Income (must be 8 digits max): ");
		income = scan.next();
		while (!validate(income, REGEX_INCOME)) {
			System.out.print("Income (must be numeric and 8 digits max): ");
			income = scan.next();
		}
		
		//validate email
		System.out.print("Email (Ex: example@email.com): ");
		email = scan.next();
		while (!validate(email, REGEX_EMAIL)) {
			System.out.println("Entered email is invalid. Please try again!");
			System.out.print("Email (Ex: example@email.com): ");
			email = scan.next();
		} 		
		//validate state
		System.out.print("State (Ex: TX): ");
		state = scan.next();
		while (!validate(state, REGEX_STATE)) {
			System.out.println("Invalid input. Please try again!");
			System.out.print("State (Ex: TX): ");
			state = scan.next();
		} 
		
		Employee emp = new Employee(name,Integer.parseUnsignedInt(income),email,state);
		
		System.out.println(emp);
		FileOutputStream fos = new FileOutputStream("data.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(emp);
	}
}
