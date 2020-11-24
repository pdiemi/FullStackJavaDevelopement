package collectiondemos;

import java.util.*;

public class ArrayListDemo {

	public static void printArrayList(ArrayList<Employee> al) {
		int select =2 ;
		Scanner scan = new Scanner(System.in);
		
		while (select != 1 && select != 0) {
			System.out.print("Do you want to print the array list? (1-yes or 0-no): ");
			select =scan.nextInt();
		}

		if(select == 1) {
			al.forEach(System.out::println);
			/*for(Employee ob:al) {
				System.out.println(ob);
			}*/
		}
		else {
			System.out.println("Array list is not printed.");
			System.out.println();
		}
	}
	
	public static void showMenu() {
		System.out.println("Welcome to ArrayList Examples!");
		System.out.println("Please choose an example below: ");
		System.out.println("0 - Exit the program");
		System.out.println("1 - Size of the ArrayList");
		System.out.println("2 - Print the ArrayList");
		System.out.println("3 - Add a new element to end of the ArrayList");
		System.out.println("4 - Insert a new elemnent to the ArrayList");
		System.out.println("5 - Remove an element from the ArrayList");
		System.out.println("6 - Sort ArrayList ASC by employee ID");
		System.out.println("7 - Sort ArrayList ASC by employee name");
		System.out.println("8 - Sort ArrayList ASC by employee city");
		System.out.println("9 - Reverse the ArrayList");
		System.out.print("Please enter a number between 0 and 9: ");
	}
	
	public static void main(String args[]) {
		//Initialize an ArrayList of Employee
		ArrayList<Employee> al = new ArrayList<Employee>();
		
		al.add(new Employee(101, "emp 1", "austin"));
		al.add(new Employee(102, "emp 2", "austin"));
		al.add(new Employee(103, "emp 3", "austin"));
		al.add(new Employee(104, "emp 4", "austin"));
		al.add(new Employee(105, "emp 5", "austin"));
		
		int choice = -1;
		Scanner scan2 = new Scanner(System.in);
		
		
		do {
			showMenu();
			choice = scan2.nextInt();
			while(choice > 9 && choice < 0) {
				System.out.print("Please enter a number between 0 and 9: ");
			}
			
			switch (choice)  {
			case 0:
				System.out.println("Goodbye! See you later.");
				return;
				//break;
			case 1: 
				System.out.println("Number of employees: "+ al.size());
				printArrayList(al);
				break;
			case 2:
				al.forEach(System.out::println);
				break;
			case 3:
				System.out.println("Add emp 7 to ArrayList");
				al.add(2,new Employee(107, "emp 7", "austin")); 
				System.out.println("Adding DONE!");
				printArrayList(al);
				break;
			case 4:
				System.out.println("Insert emp 6 to position al[2]");
				al.add(2,new Employee(106, "emp 6", "austin")); 
				System.out.println("Inserting DONE!");
				printArrayList(al);
				break;
			case 5:
				System.out.println("Remove emp at position al[3]");
				al.remove(3);
				System.out.println("Removing DONE!");
				printArrayList(al);
				break;
			case 6:
				Collections.sort(al, new IdComparator());
				System.out.println("Sorting by ID. DONE!");
				printArrayList(al);
				break;
			case 7:
				Collections.sort(al, new NameComparator());
				System.out.println("Sorting by name. DONE!");
				printArrayList(al);
				break;
			case 8:
				Collections.sort(al, new CityComparator());
				System.out.println("Sorting by city. DONE!");
				printArrayList(al);
				break;
			case 9:
				Collections.reverse(al);
				System.out.println("Reverse list. DONE!");
				printArrayList(al);
				break;
			default:
				break;
			}
			
			System.out.print("\nDo you want to continue? 1-yes, 0-no: ");
			choice = scan2.nextInt();
			
		} while (choice!=0);
		
		System.out.println("Goodbye! See you later.");
		
	}

}
