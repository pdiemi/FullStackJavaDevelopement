package threaddemos;

public class ThreadDemo2 extends Thread{

	public void run() {
		System.out.println("|----------------------------------------------|");
		System.out.println("|        Child thread extends Thread           |");
		System.out.println("|----------------------------------------------|");
		System.out.println("Child thread is running\n");
	}
}
