package com.chapter1;

/**
 * 
 * @author tangj
 *
 * ��һ��runnable�߳�
 */
public class FirstRunnable {

	public static void main(String[] args) {
		MyRunnable myRunnable = new MyRunnable();
		Thread thread = new Thread(myRunnable);
		thread.start();
		// myRunnable.run();
	}

}

class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("Hello World!");
	}

}