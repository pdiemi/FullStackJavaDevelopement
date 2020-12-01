package threaddemos;

public class WelcomeThread {

	public static void main(String[] args) {
		
		System.out.println("|----------------------------------------------|");
		System.out.println("|            Current Thread example            |");
		System.out.println("|----------------------------------------------|");
		//Thread.currentThread() returns Thread[thread_name, priority, thread_group_name]
		Thread t = Thread.currentThread();
		System.out.println("The current thread is " + t); 
		
		System.out.println("\n");
		System.out.println("|----------------------------------------------|");
		System.out.println("|    Thread set name and priority example      |");
		System.out.println("|----------------------------------------------|");
		
		t.setName("myMainThread");
		//Thread's priority is in scale of 1-10
		//MAX_PRIORITY = 10, MIN_PRIORITY = 1, NORM_PRIORITY = 5
		t.setPriority(Thread.MAX_PRIORITY);
		System.out.println("Current thread's name and priority has changed:\n" + t);
		
		System.out.println("\n");
		System.out.println("|----------------------------------------------|");
		System.out.println("|            Thread sleep example              |");
		System.out.println("|----------------------------------------------|");
		
		System.out.print("Welcome");
		try {
			Thread.sleep(4000); //current thread will sleep for 2 seconds
			System.out.print(" to");
			Thread.sleep(4000);
			System.out.println(" HCL");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
