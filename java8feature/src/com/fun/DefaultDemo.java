package com.fun;

public interface DefaultDemo {

	public void show();
	
	public default void show2() {
		System.out.println("I am default method within WorkerInterface");
	}
}
