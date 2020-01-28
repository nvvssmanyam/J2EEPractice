package com.practice.threads;

import java.util.concurrent.CountDownLatch;

class PubgPlayer implements Runnable {

	CountDownLatch countDownLatch;
	
	public PubgPlayer(CountDownLatch countDownLatch) {
		this.countDownLatch = countDownLatch;
	}
	
	@Override
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName()+" is going to ready");
			Thread.sleep(3000);
			countDownLatch.countDown();
			System.out.println(Thread.currentThread().getName()+" ready.");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}

public class CountDownLatchGame {

	public static void main(String[] args) throws InterruptedException {
		
		CountDownLatch countDownLatch = new CountDownLatch(4);
		
		
		Thread player1 = new Thread(new PubgPlayer(countDownLatch), "Player 1");
		Thread player2 = new Thread(new PubgPlayer(countDownLatch), "Player 2");
		Thread player3 = new Thread(new PubgPlayer(countDownLatch), "Player 3");
		Thread player4 = new Thread(new PubgPlayer(countDownLatch), "Player 4");
		Thread player5 = new Thread(new PubgPlayer(countDownLatch), "Player 5");
		Thread player6 = new Thread(new PubgPlayer(countDownLatch), "Player 6");
		
		System.out.println("Game will start soon.., Waiting for players");
		
		Thread.sleep(2000);
		player1.start();
		Thread.sleep(2000);
		player2.start();
		Thread.sleep(2000);
		player3.start();
		Thread.sleep(2000);
		player4.start();
		Thread.sleep(2000);
		player5.start();
		Thread.sleep(2000);
		player6.start();
		
		countDownLatch.await();
		
		System.out.println("Game started...");
	}

}
