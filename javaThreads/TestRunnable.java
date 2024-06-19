package com.javaThreads;

public class TestRunnable {

	public static void main(String[] args) {

		Threads threads1 = new Threads();
		Threads threads2 = new Threads();

		// Object of Thread class
		Thread t1 = new Thread(threads1);
		Thread t2 = new Thread(threads2);

		t1.setName("My Thread");
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();

	}

}
