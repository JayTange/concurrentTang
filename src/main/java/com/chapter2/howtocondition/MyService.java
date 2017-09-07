package com.chapter2.howtocondition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {

	private Lock lock = new ReentrantLock();
	public Condition conditionA = lock.newCondition();
	public Condition conditionB = lock.newCondition();

	public void awaitA() {
		try {
			lock.lock();
			System.out.println(Thread.currentThread().getName() + "������awaitA����");
			long timeBefore = System.currentTimeMillis();
			conditionA.await();
			long timeAfter = System.currentTimeMillis();
			System.out.println(Thread.currentThread().getName()+"������");
			System.out.println(Thread.currentThread().getName() + "�ȴ���: " + (timeAfter - timeBefore)/1000+"s");
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

	public void awaitB() {
		try {
			lock.lock();
			System.out.println(Thread.currentThread().getName() + "������awaitB����");
			long timeBefore = System.currentTimeMillis();
			conditionB.await();
			long timeAfter = System.currentTimeMillis();
			System.out.println(Thread.currentThread().getName()+"������");
			System.out.println(Thread.currentThread().getName() + "�ȴ���: " + (timeAfter - timeBefore)/1000+"s");
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

	public void signallA() {
		try {
			lock.lock();
			System.out.println("�������ѳ���");
			conditionA.signalAll();
		} finally {
			lock.unlock();
		}
	}
	
	public void signallB() {
		try {
			lock.lock();
			System.out.println("�������ѳ���");
			conditionB.signalAll();
		} finally {
			lock.unlock();
		}
	}
}
