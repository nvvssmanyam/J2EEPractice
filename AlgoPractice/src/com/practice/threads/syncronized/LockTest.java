package com.practice.threads.syncronized;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class LockTest1 {
	
	private Lock lock = new ReentrantLock();
//	private Lock
	
	public void outer() {
		lock.lock();
		System.out.println("Aquired first lock");
		inner();
		lock.unlock();
		System.out.println("Released first lock");
	}
	
	public synchronized void inner() {
		lock.lock();
		System.out.println("Aquired second lock");
		lock.unlock();
		System.out.println("Released second lock");
	}

}

public class LockTest implements Runnable {

	@Override
	public void run() {
		LockTest1 test = new LockTest1();
		test.outer();
	}
	
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(2);
		executor.execute(new LockTest());
		
		executor.shutdown();
		System.out.println("All tasks submitted.");
	}
	
}
