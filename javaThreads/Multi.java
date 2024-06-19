
package com.javaThreads;

public class Multi extends Thread {

	public Multi() {

	}

//overrides java.lang.Thread.run() method
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread() + " = " + i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
