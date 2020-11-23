package exceptiondemos;

public class ThrowsDemo {

	public static void demoProc() {
		try {
			//System.out.println("inside demoproc");
			throw new NullPointerException("exception is being thrown");
		}
		catch (NullPointerException e) {
			System.out.println("catch it");
		}
	}
	
	public static void main(String args[]) {
		demoProc();
	}
}
 