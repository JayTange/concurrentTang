package com.chapter2.consumeone;

/**
 * �������߳�
 * 
 * @author tangj
 *
 */
public class MyThreadService2 implements Runnable {

	private Service service;

	public MyThreadService2(Service service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		for (;;) {
			service.consume();
		}
	}

}
