package collectiondemos;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<Integer, Employee> tm = new TreeMap<Integer, Employee>();
		
		tm.put(101, new Employee(1001, "admin", "austin"));
		tm.put(102, new Employee(1002, "moderator", "austin"));
		tm.put(103, new Employee(1003, "user 3", "austin"));
		tm.put(104, new Employee(1004, "user 4", "austin"));
		
		System.out.println(tm);		

	}

}
