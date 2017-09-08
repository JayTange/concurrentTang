package com.chapter2.consumeone;

public class Application {

	public static void main(String[] args) {
		Service service = new Service();
		Runnable produce = new MyThreadService1(service);
		Runnable consume = new MyThreadService2(service);
		new Thread(produce, "������  ").start();
		new Thread(consume, "������  ").start();
	}

}
