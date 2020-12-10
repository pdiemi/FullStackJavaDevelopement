package com.fun;

public class WorkerMain {

	public static void execute(WorkerInterface workerInterface) {
		workerInterface.doSomeWork();
	}
	
	public static void main(String args[]) {
		execute(new WorkerInterface() {

			@Override
			public void doSomeWork() {
				System.out.println("I am called inside class");
			}
			
		});
		
		//java 8 feature, lambda exp
		
		execute(()->System.out.println("I am called using java 8 tech"));
	}
}
