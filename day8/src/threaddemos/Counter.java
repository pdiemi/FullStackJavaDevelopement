package threaddemos;

public class Counter extends Thread{

	public void run() {
		for(int i=0; i<5; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
}
