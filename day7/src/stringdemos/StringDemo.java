package stringdemos;

public class StringDemo {

	public static void main(String[] args) {
		
		String msg = "Welcome"; //String literal
		String ms = "Welcome"; //msg and ms now point to the same object "Welcome"
		
		String s = "John";
		/*
		s.concat("Paul");
		System.out.println(s);
		
		s = s.concat("Paul");
		System.out.println(s);
		*/
		String s2 = "John";
		String s3 = new String("John");
		String s4 = "Paul";
		
		System.out.println(s == s3);

	}

}
