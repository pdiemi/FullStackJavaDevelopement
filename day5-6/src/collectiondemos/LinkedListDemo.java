package collectiondemos;

import java.util.*;

public class LinkedListDemo {

	public static void main(String args[]) {
		//Initialize an ArrayList of Employee
		LinkedList<Employee> al = new LinkedList<Employee>();
		
		al.add(new Employee(101, "emp 1", "austin"));
		al.add(new Employee(102, "emp 2", "austin"));
		al.add(new Employee(103, "emp 3", "austin"));
		al.add(new Employee(104, "emp 4", "austin"));
		al.add(new Employee(105, "emp 5", "austin"));
				
		al.addFirst(new Employee(106, "emp 6", "austin"));
		al.addLast(new Employee(107, "emp 7", "austin"));
		
		System.out.println("Linked list:");
		al.forEach(System.out::println);
		
		Collections.sort(al, new NameComparator());
		
		System.out.println("\nLinked list sorted by name:");
		al.forEach(System.out::println);
		
	}
}
