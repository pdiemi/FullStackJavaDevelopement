package threaddemos;

public class ThreadDemo3 implements Runnable{

	@Override
	public void run() {
		System.out.println("|----------------------------------------------|");
		System.out.println("|       Child Thread implements Runnable       |");
		System.out.println("|----------------------------------------------|");
		System.out.println("Another Child thread is running\n");
		
	}

}
