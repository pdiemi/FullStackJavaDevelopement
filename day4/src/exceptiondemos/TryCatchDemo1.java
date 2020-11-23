package exceptiondemos;

public class TryCatchDemo1 {

	public static void main(String args[]) {
		try {
			int a = 0; //Integer.parseInt(args[0]);
			int b = 10; //Integer.parseInt(args[1]);
			int c = b/a;
		}
		catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch (Exception e2) {
			System.out.println("inside main");
		}
		finally {
			System.out.println("inside finally");
		}
	}
}
