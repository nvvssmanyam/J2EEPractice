package com.practice.threads;

public class SequentialProgramPerformance {
	
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
		long startTime = System.currentTimeMillis();
		try {
			demo.m1();
			demo.m1();
			demo.m1();
			demo.m1();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Ended in "+ (System.currentTimeMillis() - startTime));
	}
	
}
