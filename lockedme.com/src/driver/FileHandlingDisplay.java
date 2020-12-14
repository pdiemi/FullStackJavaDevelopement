package driver;

import java.util.ArrayList;
import java.util.Arrays;

public class FileHandlingDisplay implements Display {

	@Override
	public void welcomeDisplay() {
		System.out.println("|----------------------------------------|\n"
				+ "|     Welcome to My File Application     |\n" + "|----------------------------------------|\n"
				+ "| This application has been developed by |\n" + "| Diemi Pham from HCL Technologies USA   |\n"
				+ "| since Dec, 2020.                       |\n" + "|----------------------------------------|\n");

	}

	@Override
	public void mainDisplay() {
		ArrayList<String> options = new ArrayList<String>(
				Arrays.asList("  0. Exit", "  1. View all files and directories", "  2. Add a new file or directory",
						"  3. Delete a file or directory", "  4. Search for a file or directory"));

		System.out.println("|----------------------------------------|\n"
				+ "|               Main Menu                |\n" + "|----------------------------------------|");
		options.forEach(System.out::println);
		System.out.println("|----------------------------------------|\n");
		System.out.println("Please enter the action number you would like to perform.\n"
				+ "i.e. enter number 1 to view all files and directories.");

	}

	@Override
	public void addDisplay() {

		System.out.println("|----------------------------------------|\n"
						 + "|             Add a New File             |\n" 
						 + "|----------------------------------------|");

		System.out.println("You are about to add a new file to this directory.");
		System.out.println("Would you like to continue? Enter 1 for YES or 0 for NO.");

	}

	@Override
	public void deleteDisplay() {
		System.out.println("|----------------------------------------|\n"
						 + "|             Delete a File              |\n" 
						 + "|----------------------------------------|");

		System.out.println("You are about to delete a file from this directory.");
		System.out.println("Would you like to continue? Enter 1 for YES or 0 for NO.");

	}

	@Override
	public void searchDisplay() {
		System.out.println("|----------------------------------------|\n"
				 		 + "|             Search a File              |\n"
				 		 + "|----------------------------------------|");

		System.out.println("You are about to search for a file in this directory.");
		System.out.println("Would you like to continue? Enter 1 for YES or 0 for NO.");

	}

	@Override
	public void updateDisplay() {
		System.out.println("|----------------------------------------|\n"
						 + "|             Update a File              |\n"
						 + "|----------------------------------------|");

		System.out.println("You are about to modify a file in this directory.");
		System.out.println("Would you like to continue? Enter 1 for YES or 0 for NO.");

	}

}
