package com.practice.threads;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo2 {

	public static void main(String[] args) throws InterruptedException {
		
		CountDownLatch latch = new CountDownLatch(3);
		
		Thread player1 = new Thread(new Player(latch), "Player 1");
//		Thread player2 = new Thread(new Player(latch), "Player 2");
//		Thread player3 = new Thread(new Player(latch), "Player 3");
//		Thread player4 = new Thread(new Player(latch), "Player 4");
//		Thread player5 = new Thread(new Player(latch), "Player 5");
//		Thread player6 = new Thread(new Player(latch), "Player 6");
		

		System.out.println("Waiting for players...");
		
		
		player1.start();
//		player6.start();
//		player2.start();
//		player3.start();
//		player5.start();		
//		player4.start();
		
		latch.await();
		
		System.out.println("Game started...");
		
	}
	
}

class Player implements Runnable {
	
	CountDownLatch latch;
	
	Player(CountDownLatch latch) {
		this.latch = latch;
	}
	
	public void run() {
		System.out.println(Thread.currentThread().getName()+"Started");
		latch.countDown();
		System.out.println("Player 1 joined");
		try {
			System.out.println("Waiting...");
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		latch.countDown();
		System.out.println("Player 2 joined");
		try {
			System.out.println("Waiting...");
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		latch.countDown();
		System.out.println("Player 3 joined");
		try {
			System.out.println("Waiting...");
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		latch.countDown();
		System.out.println("Player 4 joined");
	}
	
}
