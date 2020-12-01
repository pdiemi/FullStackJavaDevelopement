package threaddemos;

class TwoStrings {

	static synchronized void print(String str1, String str2) {
		System.out.print(str1);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(str2);
	}
}

class PrintStringThread implements Runnable{

	Thread thread;
	String str1;
	String str2;
	
	PrintStringThread(String str1, String str2) {
		this.str1 = str1;
		this.str2 = str2;
		thread = new Thread(this);
		thread.start();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		TwoStrings.print(str1, str2);
	}	
}

class UnSync {
	public static void main(String args[]) {
		new PrintStringThread("Hello ", "there.");
		new PrintStringThread("How are ", "you?");
		new PrintStringThread("Thank you ", "very much!");
	}
}
