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
*/

package emailvalidation;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class EmailValidation {

	//domain name
	private String domain;
	//employee email list
	private ArrayList emailList;
	
	private static final String REGEX = "^(.+)@(.+)$";
	
	//construction with parameters
	public EmailValidation(String domain, ArrayList emailList) {
		super();
		this.domain = domain;
		this.emailList = emailList;
	}

	/*
	 * This method uses Java regex to validate syntax of 
	 * input from user. If input does not follow 
	 * <eployee_name>@<domain>,the method returns false. 
	 * Otherwise, returns true.
	 */
	public boolean validateSyntax(String input) {
		return false;
 	}
	
	/*
	 * This method validate if the input from user exists
	 * in the given email array list. The method returns true
	 * if the input is in the email list. Otherwise, returns false.
	 * */
	public boolean validateExist(String input) {
		return false;
	}
	
	public static void main(String[] args) {
		
		//get input from user
		
		//validate syntax of input
		
		//search for input from the email list
	}

}
