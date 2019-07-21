package com.practice.threads.syncronized;

import java.util.Scanner;

public class WaitAndNotifiyDemo {
	
	public void produce() throws InterruptedException {
		synchronized(this) {
			System.out.println("Producer thead running.");
			wait();
			System.out.println("Resumed.");
		}
		
	}
	
	public void consume() throws InterruptedException {
		Thread.sleep(2000);
		synchronized(this) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Waiting for return key.");
			scanner.nextLine();
			System.out.println("Return key pressed.");
			notifyAll();
			Thread.sleep(5000);
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		final WaitAndNotifiyDemo demo = new WaitAndNotifiyDemo();
		Thread t1 = new Thread(()-> {
			try {
				demo.produce();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		
		Thread t2 = new Thread(()-> {
			try {
				demo.consume();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("Completed...");
	}

}
