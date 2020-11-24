package typecasting;

public class TypeCasting {

	public static void main(String[] args) {
		//Implicit type casting: done by compiler
		System.out.println("Implicit type casting");
		System.out.println("----------------------------");
		char c = 'A';
		int i = c;
		float f = c;
		long l = c;
		double d = c;
		System.out.println("Value of c:\t\t" + c);
		System.out.println("Int value of c:\t\t" + i);
		System.out.println("Float value of c:\t" + f);
		System.out.println("Long value of c:\t" + l);
		System.out.println("Double value of c:\t" + d);
		
		//Explicit type casting: done by programmers
		System.out.println("\n\n");
		System.out.println("Explicit type casting");
		System.out.println("---------------------");
		double x =3.14;
		int y = (int) x;
		System.out.println("Value of x:\t" + x);
		System.out.println("Int value of x:\t" + y);

	}

}
