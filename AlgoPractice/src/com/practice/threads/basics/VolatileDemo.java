package com.practice.threads.basics;

import java.util.Scanner;

class Thread1 extends Thread {
	
	protected volatile boolean running = true;

	@Override
	public void run() {
		while(running) {
			for (int i = 0; i < 10; i++) {
				System.out.println("Hello "+i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public void shutdown() {
		running = false;
	}
	
}

public class VolatileDemo {

	public static void main(String[] args) {
		
		Thread1 thread1 = new Thread1();
		thread1.start();
		
		System.out.println("Press return key to exit...");
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		
		thread1.shutdown();
		
	}
	
}
