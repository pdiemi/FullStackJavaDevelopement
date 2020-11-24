package calculator;

import java.util.*;

public class ArithmeticCalculator {

	final static int NUM_OP = 4; //number of operaors
	
	public static void showMenu() {
		System.out.println("Welcome to My Arithmetic Calculator!");
		System.out.println("Please choose an opertator from the menu below:");
		System.out.println("0 - Exit");
		System.out.println("1 - Addition");
		System.out.println("2 - Subtraction");
		System.out.println("3 - Multiplication");
		System.out.println("4 - Division");
		System.out.println();
		
	}
	
	public static double add(double a, double b) {
		return a+b;
	}
	
	public static double subtract(double a, double b) {
		return a-b;
	}
	
	public static double multiply(double a, double b) {
		return a*b;
	}
	
	public static double divide(double a, double b) {
		return a/b;
	}

	public static void main(String args[]) {
		
		int choice = -1;
		double numFirst, numSecond;
		Scanner scan  = new Scanner(System.in);
		
		do {
			//show menu
			showMenu();
			while (choice<0 || choice >NUM_OP) {
				System.out.println("Enter an integer between 0 and " + NUM_OP);
				choice = scan.nextInt();
			}
			
			//validate user input
			
			//demonstrate calculation
			
			
		} while (choice != 0);
		
		System.out.println("Calculator is turned off. See you later!");
	}
}
