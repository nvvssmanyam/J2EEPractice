package com.practice.threads.syncronized;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Process implements Runnable {
	
	private int id;
	
	public Process(int id) {
		this.id = id;
	}
	
	public void run() {
		System.out.println("Started :: "+id);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Ended :: "+id);
	}
	
}

public class ExecutorsServiceDemo {

	public static void main(String[] args) throws InterruptedException {
		
		ExecutorService executor = Executors.newFixedThreadPool(2);
		
		for (int i = 0; i < 5; i++) {
			executor.submit(new Process(i));
		}
		
		/*
		 * Initiates an orderly shutdown in which previously submitted tasks are executed, but no new tasks will be accepted. Invocation has no additional effect if already shut down. 
		 */
		executor.shutdown();
		System.out.println("All tasks submitted.");
		
		/*
		 *  java.util.concurrent.RejectedExecutionException: 
		 *  Task java.util.concurrent.FutureTask@1f96302 rejected from java.util.concurrent.ThreadPoolExecutor@14eac69[Shutting down, pool size = 2, active threads = 2, queued tasks = 3, completed tasks = 0]
		 *  
		 *  If we added any task after shutdown, it will give the aboce exception
		 */
//		executor.submit(new Process(5));
		
		/*
		 *  Blocks until all tasks have completed execution after a shutdown request, or the timeout occurs, or the current thread is interrupted, whichever happens first.
		 */
		executor.awaitTermination(1, TimeUnit.DAYS);
		System.out.println("All tasks completed.");
		
	}
	
}
