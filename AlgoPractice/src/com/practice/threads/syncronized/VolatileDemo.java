package com.practice.threads.syncronized;

import java.util.Scanner;

class Processor extends Thread {
	
	// If running is not volatile, thread may/may not shutdown
	private volatile boolean running = true;
	
	public void run() {
		while(running) {
			System.out.println("Hello");
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void shutdown() {
		running = false;
	}
}

public class VolatileDemo {
	
	public static void main(String[] args) {
		
		Processor proc1 = new Processor();
		proc1.start();
		
		System.out.println("Press return to stop ...");
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		
		proc1.shutdown();
		scanner.close();
		
	}

}
