package day2;
import java.util.Scanner;

public class SwitchCase {

	
	
	public static void  main(String args[]) {
		char grade = 'B';
		int point;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your points (must be integer between 0 and 100): ");
		point = scan.nextInt();
		
		if (point>100 || point<0)
			grade = 'X';
		else if (point<55)
			grade = 'E';
		else if (point<65)
			grade = 'D';
		else if (point<73)
			grade = 'C';
		else if (point<80)
			grade = 'B';
		else
			grade = 'A';
		
		switch(grade) {
		case 'A':
			System.out.println("Your grade is "+grade);
			break;
		case 'B':
			System.out.println("Your grade is "+grade);
			break;
		case 'C':
			System.out.println("Your grade is "+grade);
			break;
		case 'D':
			System.out.println("Your grade is "+grade);
			break;
		case 'E':
			System.out.println("Your grade is "+grade);
			break;
		case 'X':
			System.out.println("Grade does not exist!");
			break;
		}
		
	}
}
