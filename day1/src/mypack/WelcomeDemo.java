package mypack;

public class WelcomeDemo {

	public WelcomeDemo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println("welcom to java");
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = a+b;
		
		System.out.println("addition is " + c);
		
	}
}
