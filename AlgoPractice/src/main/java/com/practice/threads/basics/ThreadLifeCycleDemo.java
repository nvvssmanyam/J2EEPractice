package com.practice.threads.basics;

public class ThreadLifeCycleDemo extends Thread {
	
	public void run() {
		try {
			this.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(this.getState());
	}

	public static void main(String[] args) throws InterruptedException {
		ThreadLifeCycleDemo t1 = new ThreadLifeCycleDemo();
		System.out.println(t1.getState());
		t1.start();
		System.out.println(t1.getState());
		t1.sleep(500l);
		System.out.println(t1.getState());
	}
	
}
