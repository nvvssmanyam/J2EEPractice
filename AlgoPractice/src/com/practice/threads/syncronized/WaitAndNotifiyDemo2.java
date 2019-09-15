package com.practice.threads.syncronized;

class PrinterThread implements Runnable {
	
	public void run() {

		synchronized (this) {
			System.out.println(Thread.currentThread().getName() + " Started.");
			
			if(Thread.currentThread().getName().equals("T1")) {
				try {
					this.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			System.out.println(Thread.currentThread().getName() + Thread.currentThread().getState());

			for (int i = 1; i <= 10; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
			System.out.println("Thread "+Thread.currentThread().getName()+" ended");
			this.notifyAll();
		}
	}
}

public class WaitAndNotifiyDemo2 {

	public static void main(String[] args) throws InterruptedException {

		PrinterThread printerThread = new PrinterThread();
		Thread thread1 = new Thread(printerThread, "T1");
		Thread thread2 = new Thread(printerThread, "T2");

		thread1.start();
		thread2.start();
		
		thread2.join();

	}

}
