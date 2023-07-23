package com.practice.threads;

public class ThreadPerformanceDemo {
	
	public void m1() throws InterruptedException {
		for(int i=1; i<100000; i++) {
			if(i==100000-1) {
				Thread.sleep(5000);
				System.out.println("Loop finished with "+Thread.currentThread().getName());
			}
		}
	}
	
	public static void main(String[] args) {
		
		ThreadPerformanceDemo demo = new ThreadPerformanceDemo();
		
		Runnable r = () -> {
			try {
				demo.m1();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};
		
		Thread t1 = new Thread(r, "Thread1");
		Thread t2 = new Thread(r, "Thread2");
		Thread t3 = new Thread(r, "Thread3");
		Thread t4 = new Thread(r, "Thread4");
		
		long startTime = System.currentTimeMillis();
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		System.out.println("Ended in "+ (System.currentTimeMillis() - startTime));
	}

}
