package calculator;

import java.util.*;

public class ArithmeticCalculator {

	final static int NUM_OP = 4; //number of operaors
	
	public static void showMenu() {
		System.out.println("|--------------------------------------------------------|");
		System.out.println("|    Welcome to My Arithmetic Calculator!                |");
		System.out.println("|    Please choose an opertator from the menu below:     |");
		System.out.println("|--------------------------------------------------------|");
		System.out.println("|    0 - Exit                                            |");
		System.out.println("|    1 - Addition                                        |");
		System.out.println("|    2 - Subtraction                                     |");
		System.out.println("|    3 - Multiplication                                  |");
		System.out.println("|    4 - Division                                        |");
		System.out.println("|--------------------------------------------------------|");		
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
		
		int choice;
		double numFirst, numSecond;
		Scanner scan  = new Scanner(System.in);
		
		do {
			choice = -1; //reset choice
			//show menu
			showMenu();
			//validate user input choice
			while (choice<0 || choice >NUM_OP) {
				System.out.print("Enter your choice between 0 and " + NUM_OP + ": ");
				choice = scan.nextInt();
			}
			
			//demonstrate selected calculation
			switch (choice) {
			case 0:
				System.out.println("Calculator is turned off. See you later!");
				return;
				//break;
			case 1:
				//addition
				System.out.print("Enter first number: ");
				numFirst = scan.nextDouble();
				System.out.print("Enter second number: ");
				numSecond = scan.nextDouble();
				System.out.println(numFirst + " + " + numSecond + " = " + add(numFirst, numSecond));
				break;
			case 2:
				//subtraction
				System.out.print("Enter first number: ");
				numFirst = scan.nextDouble();
				System.out.print("Enter second number: ");
				numSecond = scan.nextDouble();
				System.out.println(numFirst + " - " + numSecond + " = " + subtract(numFirst, numSecond));
				break;
			case 3:
				//multiplication
				System.out.print("Enter first number: ");
				numFirst = scan.nextDouble();
				System.out.print("Enter second number: ");
				numSecond = scan.nextDouble();
				System.out.println(numFirst + " * " + numSecond + " = " + multiply(numFirst, numSecond));
				break;
			case 4:
				//division
				System.out.print("Enter first number: ");
				numFirst = scan.nextDouble();
				System.out.print("Enter second number: ");
				numSecond = scan.nextDouble();
				while (numSecond == 0) {
					System.out.println("Cannot divide by 0. Please try again!");
					System.out.print("Enter second number: ");
					numSecond = scan.nextDouble();
				}
				System.out.println(numFirst + " / " + numSecond + " = " + divide(numFirst, numSecond));
				break;
			default:
				break;
			}
			
			//continue or exit the program?
			do {
				System.out.print("\nWould you like to continue (1-yes, 0-no)? ");
				choice = scan.nextInt();
			} while (choice!=0 && choice!=1);
			
		} while (choice != 0);
		
		System.out.println("Calculator is turned off. See you later!");
	}
}
