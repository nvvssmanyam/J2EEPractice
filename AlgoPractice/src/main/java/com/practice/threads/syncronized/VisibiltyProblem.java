package com.practice.threads.syncronized;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Processor1 extends Thread {
	private VisibiltyProblem obj;
	
	Processor1(VisibiltyProblem obj){
		this.obj = obj;
	}
	
	public void run() {
		while(obj.running) {
			System.out.println("Hello");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

class Processor2 extends Thread {
	
	VisibiltyProblem obj;
	
	Processor2(VisibiltyProblem obj) {
		this.obj = obj;
	}
	
	public void run() {
		try {
			Thread.sleep(5000);
			System.out.println("Waking up process 2, calling shutdown...");
			obj.shutdown();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class VisibiltyProblem {
	
	volatile boolean running = true;
	
	public static void main(String[] args) {
		
		VisibiltyProblem obj = new VisibiltyProblem();
		
		ExecutorService service = Executors.newFixedThreadPool(2);
		
		Processor1 proc1 = new Processor1(obj);
		service.submit(proc1);
		
		Processor2 proc2 = new Processor2(obj);
		service.submit(proc2);
		
		service.shutdown();
		
	}
	
	public void shutdown() {
		System.out.println("Shutting down...");
		this.running = false;
	}

}

