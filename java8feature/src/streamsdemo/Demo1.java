package streamsdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {

	public static void main(String[] args) {
		List<String> al = new ArrayList<>();
		
		al.add("admin");
		al.add("mod");
		al.add("manager");
		al.add("main user");
		al.add("user1");
		al.add("user2");
		
		al.stream().filter(str->str.startsWith("m"))
					.sorted()
					.map(String::toUpperCase)
					.forEach(System.out::println);;

		List<String> upp = al.stream()
							 .sorted()
							 .map(String::toUpperCase)
							 .collect(Collectors.toList());
		System.out.println(upp);
	}

}
