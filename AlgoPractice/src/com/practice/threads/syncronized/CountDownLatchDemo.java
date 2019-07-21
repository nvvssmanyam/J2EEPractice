package com.practice.threads.syncronized;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Player implements Runnable {
	
	private CountDownLatch latch;
	private int id;
	
	public Player(CountDownLatch latch, int id) {
		this.latch = latch;
		this.id = id;
	}
	
	public void run() {
		System.out.println("Player "+id+" started");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		latch.countDown();
	}
	
}

public class CountDownLatchDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		CountDownLatch latch = new CountDownLatch(3);
		
		ExecutorService executor = Executors.newFixedThreadPool(3);
		
		for(int i=0; i<3; i++) {
			executor.submit(new Player(latch, i));
		}
		
		latch.await();
		
		System.out.println("Game started...");
	}

}
