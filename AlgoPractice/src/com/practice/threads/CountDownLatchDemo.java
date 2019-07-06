package com.practice.threads;

import java.util.concurrent.CountDownLatch;


/*
 *   Tut: https://dzone.com/articles/java-concurrency-count-down-latches
 */
public class CountDownLatchDemo {
	public static void main(String[] args) throws InterruptedException {

		CountDownLatch latch = new CountDownLatch(4);
		Thread t1 = new Thread(new VVS(latch), "Thread 1");
		Thread t2 = new Thread(new VVS(latch), "Thread 2");
		Thread t3 = new Thread(new VVS(latch), "Thread 3");
		Thread t4 = new Thread(new VVS(latch), "Thread 4");

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		latch.await();
		System.out.println("Srtaing Game");
	}
}

class VVS implements Runnable {
	CountDownLatch latch;

	public VVS(CountDownLatch latch) {
		this.latch = latch;
	}

	@Override
	public void run() {
		System.out.println("Thread Started " + Thread.currentThread().getName());
		latch.countDown();
		System.out.println("Thread completed " + Thread.currentThread().getName());

	}
}
