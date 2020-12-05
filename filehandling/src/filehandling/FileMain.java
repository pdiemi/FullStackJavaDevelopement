/*
 * File Handling Project
 * Developer: Diemi Pham
 * Date: Dec 2020
 * 
 * This program read file users.txt, which contains
 * a list of username and password, and parse the 
 * content into a HashMap. 
 * 
 * The program prints the username list and asks the 
 * user to enter a new user information (username and 
 * password) from the promt, then checks if the entered
 * username already exist in the list. If so, askes the
 * user to re-enter the input. Otherwise, adds the new 
 * user to the HashMap and print out the new list.
 * Finally, append the new user to the given file.
 * */

package filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class FileMain {

	public static void main(String[] args) throws IOException {
		
		//TODO: read, write, and append to a file
		//read file users.txt and parse content to an array list
		
		HashMap<String,String> userList = new HashMap<>();
		
		BufferedReader buffer = new BufferedReader(new FileReader("users.txt"));
		String line = null;
		
		while ((line = buffer.readLine()) != null) {
			String tokens[] = line.split("/");
			userList.put(tokens[0], tokens[1]);
		}
		
		buffer.close();
		
		//print the user list
		System.out.println("Username List:\n");
		System.out.println(userList.keySet());
		System.out.println("==========\n");
		
		/*
		 * add a new user to the list and write to the file.
		 * if the new user exists in the list, then deny addition.
		 * */
		//input new user information from commandline
		Scanner scan = new Scanner(System.in);
		String username, password;
		
		System.out.println("Enter a new user information:");
		System.out.print("Firstname: ");
		username = scan.next();
		
		//check if the username already exists
		while (isExist(username, userList)) {
			System.out.println("\nEntered username already exist. Please try again!");
			System.out.print("Firstname: ");
			username = scan.next();
		}
		System.out.print("Password: ");
		password = scan.next();

		//add the new user to the list 
		userList.put(username,  password);
		System.out.println("==========\n");
		System.out.println("New user is added\n");
		System.out.println(userList.keySet());
		System.out.println("==========\n");
		
		//append new user to file users.txt
		System.out.println("Saving new user to file... please wait...\n");
		appendFile("users.txt", (username+"/"+password));
		System.out.println("New user is saved to file.");
		System.out.println(userList.keySet());
		System.out.println("==========\n");
		System.out.println("Goodbye!");
		
	}
	
	public static boolean isExist(String username, HashMap<String,String> userList) {
		if (userList.isEmpty())
			return false;
		else {
			if (userList.containsKey(username))
				return true;
			else
				return false;
		}
	}
	
	public static void appendFile(String fileName, String input) {
		//open fileName in append mode
		try {
			BufferedWriter buffer = new BufferedWriter(new FileWriter(fileName, true));
			buffer.write(input);
			buffer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
