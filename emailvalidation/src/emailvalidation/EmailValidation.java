/*
Validation of an Email ID .

Project objective:
As a developer, write a program to search a string entered 
by a user from the array of strings.

Background of the problem statement:
You have an array of email IDs of employees. As a programmer, 
write a program to search the email ID entered by a user.

You must use the following:
- Eclipse/IntelliJ: An IDE to code the application
- Java: A programming language
- Git: To connect and push files from the local system to GitHub
- GitHub: To store the application code and track its versions
- Core Java concepts: Methods, collections, and strings

NOTES:
- In this project, email ID is formatted as 
  <employee_name>@<domain>
- A-Z, a-z, 0-9, -, _, and . are permitted,
  any other special character is not permitted
*/

package emailvalidation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class EmailValidation {

	//REGEX used for validate email format
	//public static final String REGEX = "^(.+)@(.+)$";
	
	public static final String REGEX = "^[A-Za-z0-9]+[A-Za-z0-9_.-]*[A-Za-z0-9]+" +
									   "@[A-Za-z0-9]+[A-Za-z0-9.]+[A-Za-z0-9]+$";
	
	/*
	 * This method uses Java regex to validate syntax of 
	 * input from user. If input does not follow 
	 * <eployee_name>@<domain>,the method returns false. 
	 * Otherwise, returns true.
	 */
	public static boolean validate(String input) {
		if (input.isEmpty())
			return false;
		else {
			Pattern pattern = Pattern.compile(REGEX);
			return pattern.matcher(input).matches();
		}
 	}
	
	/*
	 * This method validate if the input from user exists
	 * in the given email array list. The method returns true
	 * if the input is in the email list. Otherwise, returns false.
	 * */
	public static boolean search(String input, ArrayList list) {
		if (input.isEmpty())
			return false;
		else {
			return list.contains(input);
		}
	}
	
	public static ArrayList<String> getEmailList(String fileName, ArrayList<String> emailList) {
		
		try {
			File file = new File(fileName);
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line = null;
			while ((line = br.readLine()) != null) {
				emailList.add(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return emailList;
	}
	
	public static void main(String[] args) {
		//create an email list from file email.txt
		ArrayList<String> emailList = new ArrayList<String>();
		getEmailList("email.txt", emailList);
		//emailList.forEach(System.out::println);
		
		//get input from user
		String input;
		System.out.println("Enter email address to validate (ex: example@email.com)");
		Scanner scan = new Scanner(System.in);
		input = scan.next();
		
		//validate syntax of input
		while (!validate(input)) {
			System.out.println("Your input is invalid. Please try again.");
			System.out.println("Enter email address to validate (ex: example@email.com):\n");
			input = scan.next();
		}
		
		//search for input from the email list
		System.out.println("Validating... Please wait...");
		System.out.println(input + " is " + (search(input, emailList)?"verified!":"not found!"));
	}

}
