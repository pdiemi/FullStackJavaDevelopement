package collectiondemos;

import java.util.ArrayList;
import java.util.HashMap;

public class HasMapDemo {

	public static void main(String[] args) {
		HashMap<Integer, Employee> hm = new HashMap<Integer, Employee>();
		
		hm.put(101, new Employee(1001, "admin", "austin"));
		hm.put(102, new Employee(1002, "moderator", "austin"));
		hm.put(103, new Employee(1003, "user 3", "austin"));
		hm.put(104, new Employee(1004, "user 4", "austin"));
		
		System.out.println(hm);
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		
		al.add(new Employee(101, "emp 1", "austin"));
		al.add(new Employee(102, "emp 2", "austin"));
		al.add(new Employee(103, "emp 3", "austin"));
		al.add(new Employee(104, "emp 4", "austin"));
		al.add(new Employee(105, "emp 5", "austin"));
		
		HashMap<Integer, ArrayList<Employee>> hm2 = new HashMap<Integer, ArrayList<Employee>>();
		hm2.put(1111, al);
		System.out.println(hm2);
	}

}
