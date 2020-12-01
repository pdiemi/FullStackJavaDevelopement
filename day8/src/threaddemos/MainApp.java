package threaddemos;

public class MainApp {

	public static void main(String[] args) {
		
		
		ThreadDemo2 th = new ThreadDemo2();

		th.start(); //thread is runnable, CPU will invoke th.run()
		
		ThreadDemo3 th3 = new ThreadDemo3();
		Thread t = new Thread(th3);
		
		t.start();
	}

}
