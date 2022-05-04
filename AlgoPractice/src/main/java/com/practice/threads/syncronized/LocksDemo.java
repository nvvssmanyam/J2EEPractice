package com.practice.threads.syncronized;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LocksDemo {

	private Random random = new Random();

	private Object lock1 = new Object();
	private Object lock2 = new Object();

	private List<Integer> list1 = new ArrayList<>();
	private List<Integer> list2 = new ArrayList<>();

	public void stageOne() {
		synchronized (lock1) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			list1.add(random.nextInt(100));
		}
	}

	public void stageTwo() {
		synchronized (lock2) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			list2.add(random.nextInt(100));
		}
	}

	public static void main(String[] args) throws InterruptedException {

		LocksDemo demo = new LocksDemo();

		long start = System.currentTimeMillis();

		Thread t1 = new Thread(() -> demo.process());
		Thread t2 = new Thread(() -> demo.process());

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		// demo.process();
		long end = System.currentTimeMillis();
		System.out.println("Total time : " + (end - start));
		System.out.println("List1 : " + demo.list1.size() + "; List2: " + demo.list2.size());

	}

	public void process() {
		for (int i = 0; i < 1000; i++) {
			stageOne();
			stageTwo();
		}
	}

}
