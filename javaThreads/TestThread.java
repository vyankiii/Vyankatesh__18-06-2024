package com.javaThreads;

public class TestThread {

	public static void main(String[] args) {

		Multi multi = new Multi();
		Multi multi1 = new Multi();
		Multi multi2 = new Multi();

		multi.start();
		multi1.start();
		multi2.start();

	}

}
