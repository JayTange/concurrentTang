package com.chapter1;

/**
 * 
 * @author tangj
 * 
 * ��һ���򵥵��߳�
 */
public class FirstThread {

	public static void main(String[] args) {
		InnerThread thread = new InnerThread();
		thread.start();
		System.out.println("thread stop");
	}

	
}

class InnerThread extends Thread{

	@Override
	public void run() {
		super.run();
		System.out.println("Hello World!");
	}
}