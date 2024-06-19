package com.javaThreads;

public class Threads implements Runnable {

	public Threads() {

	}

	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(Thread.currentThread() + " = " + i);
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
