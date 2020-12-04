
/*
 * Developer: Diemi Pham
 * Project: Validation of an Email ID
 * Date: Dec 2020
 * 
 * This program takes an email address entered by user
 * as input and validate if the input email address is
 * valid. A valid email address must follow the format
 * <username>@<domain> and exists in the given email list.
 * The email list is provided as a text file (email.txt).
 * 
 * - email address is not case sensitive
 * - <username> must not start/end with a special character
 * - <username> allows a-z, 0-9, hyphen (-), underscore (_),
 *   and dot (.)
 * - <username> is no shorter than two characters
 * - <domain> must not start/end with a special character
 * - <domain> allows a-z, 0-9, and dot(.)
 * */

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
	public static boolean search(String input, ArrayList<String> list) {
		if (input.isEmpty())
			return false;
		else {
			return list.contains(input);
		}
	}
	
	/*
	 * This method is used to dump a list of email from
	 * file <fileName> to an array list <emailList> and
	 * returns the emailList.
	 * */
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
	
	/*
	 * Driver method for the program
	 * */
	public static void main(String[] args) {
		
		//print instrucstion
		System.out.println( "---------------------------------------------------------------\n" +
							"\tWelcome to Email Address Validator!\n" +
							"---------------------------------------------------------------\n" +
							" This program takes an email address entered by user\r\n" + 
							" as input and validate if the input email address is\r\n" + 
							" valid. A valid email address must follow the format\r\n" + 
							" <username>@<domain> and exists in the given email list.\r\n" + 
							" The email list is provided as a text file (email.txt).\r\n" +
							" \r\n" + 
							" - email address is not case sensitive\r\n" + 
							" - <username> must not start/end with a special character\r\n" + 
							" - <username> allows a-z, 0-9, hyphen (-), underscore (_),\r\n" + 
							"   and dot (.)\r\n" + 
							" - <username> is no shorter than two characters\r\n" + 
							" - <domain> must not start/end with a special character\r\n" + 
							" - <domain> allows a-z, 0-9, and dot(.)\r\n" +
							"\r\n" +
							" For testing purpose, examples of valid email address are:\r\n" +
							"\texample@email.com\r\n" +
							"\tmichaeljreynolds@dayrep.com\r\n" +
							"---------------------------------------------------------------\n");
		
		
		//create an email list from file email.txt
		ArrayList<String> emailList = new ArrayList<String>();
		getEmailList("email.txt", emailList);
		//emailList.forEach(System.out::println);
		
		//get input from user
		String input;
		System.out.println("Enter email address to validate (ex: example@email.com)");
		Scanner scan = new Scanner(System.in);
		input = scan.next().toLowerCase();
		
		//validate syntax of input
		while (!validate(input)) {
			System.out.println("Your input is invalid. Please try again.");
			System.out.println("Enter email address to validate (ex: example@email.com):\n");
			input = scan.next().toLowerCase();
		}
		
		//search for input from the email list
		System.out.println("Searching... Please wait...");
		System.out.println(input + " is " + (search(input, emailList)?"verified!":"not found!"));
		
		//close the scanner
		scan.close();
	}

}
