package collectiondemos;

import java.util.*;

public class HashSetDemo {

	public static void main(String[] args) {
		//Initialize an ArrayList of Employee
				TreeSet<Employee> al = new TreeSet<Employee>();
				
				al.add(new Employee(101, "emp 1", "austin"));
				al.add(new Employee(102, "emp 2", "austin"));
				al.add(new Employee(103, "emp 3", "austin"));
				al.add(new Employee(104, "emp 4", "austin"));
				al.add(new Employee(105, "emp 5", "austin"));
						
				System.out.println("Hash Set:");
				al.forEach(System.out::println);

	}

}
