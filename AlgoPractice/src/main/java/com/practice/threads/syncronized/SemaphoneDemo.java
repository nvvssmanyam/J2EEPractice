package com.practice.threads.syncronized;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

class Connection {
	private static Connection instance = new Connection();
	
	private Semaphore sem = new Semaphore(10);
	
	private int connections = 0;
	private Connection() {
		
	}
	
	public static Connection getInstance() {
		return instance;
	}
	
	public void connect() throws InterruptedException {
		try {
			sem.acquire();
			doConnect();
		} finally {
			sem.release();
		}
		
	}
	
	public void doConnect() throws InterruptedException {
		synchronized (this) {
			connections++;
			System.out.println("Current connections : "+connections);
		}
		
		Thread.sleep(2000);
		
		synchronized (this) {
			connections--;
		}
	}
	
}

public class SemaphoneDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		ExecutorService executor = Executors.newCachedThreadPool();
		
		for (int i = 0; i < 200; i++) {
			executor.submit(new Runnable() {
				public void run() {
					try {
						Connection.getInstance().connect();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				 }
			});
		}
		
		executor.shutdown();
		executor.awaitTermination(1, TimeUnit.DAYS);
	}

}
