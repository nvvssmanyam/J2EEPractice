package com.practice.threads.syncronized;

public class SynchronizedDemo {
	
	private int count = 0;
	
	/*
	 *  When we use synchronized key word, it will acquire intrinsic lock
	 *  If one more thread is calling, it will wait until existing lock get released
	 *  
	 *  Only one thread can acquire intrinsic lock at given time
	 */
	public synchronized void increment() {
		count++;
	}
	
	public static void main(String[] args) {
		SynchronizedDemo demo = new SynchronizedDemo();
		demo.doWork();
	}

	public void doWork() {
		
		Thread t1 = new Thread(()-> {
			for(int i=0; i<10000; i++) {
				increment();
			}
			System.out.println(Thread.currentThread().getName()+" finished...");
		});
		
		Thread t2 = new Thread(()-> {
			for(int i=0; i<10000; i++) {
				increment();
			}
			System.out.println(Thread.currentThread().getName()+" finished...");
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(count);
		
	}
}
