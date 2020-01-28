package com.practice.threads.syncronized;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Player implements Runnable {
	
	private CountDownLatch latch;
	private int id;
	
	public Player(CountDownLatch latch, int id) {
		this.latch = latch;
		this.id = id;
	}
	
	public void run() {
		try {
			Thread.sleep(3000);
			System.out.println("Player "+id+" started");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		latch.countDown();
	}
	
}

public class CountDownLatchDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		CountDownLatch latch = new CountDownLatch(3);
		
		ExecutorService executor = Executors.newFixedThreadPool(5);
		
		for(int i=0; i<5; i++) {
			executor.submit(new Player(latch, i));
		}
		
		latch.await(2000, TimeUnit.MILLISECONDS);
		
		System.out.println("Game started...");
		
	}

}
