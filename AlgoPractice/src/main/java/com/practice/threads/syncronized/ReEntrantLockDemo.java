package com.practice.threads.syncronized;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReEntrantLockDemo {
	private int count;

	private Lock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();

	private void increment() {
		for (int i = 0; i < 10000; i++) {
			count++;
		}
	}

	public void firstThread() throws InterruptedException {
		try {
			lock.lock();
			System.out.println("Waiting...");
			condition.await();
			System.out.println("Woken up...");
			increment();
		} finally {
			lock.unlock();
		}
	}

	public void secondThread() throws InterruptedException {
		Scanner scanner = null;
		try {
			Thread.sleep(2000);
			lock.lock();
			
			System.out.println("Press return key!");
			scanner = new Scanner(System.in);
			scanner.nextLine();
			System.out.println("Got return key!");
			
			condition.signal();
			
			increment();
		} finally {
			scanner.close();
			lock.unlock();
		}
	}

	public void finished() {
		System.out.println("Finished with count :: " + count);
	}

	public static void main(String[] args) throws InterruptedException {
		ReEntrantLockDemo demo = new ReEntrantLockDemo();

		Thread t1 = new Thread(() -> {
			try {
				demo.firstThread();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});

		Thread t2 = new Thread(() -> {
			try {
				demo.secondThread();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		demo.finished();
	}

}
