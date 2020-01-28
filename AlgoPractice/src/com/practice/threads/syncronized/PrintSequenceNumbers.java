package com.practice.threads.syncronized;

class PrinterThread1 implements Runnable {

	public void run() {
		synchronized (this) {

			for(int i=0; i<5; i++) {
				try {
					if ("1".equals(Thread.currentThread().getName())) {
						System.out.println(Thread.currentThread().getName());
						this.notifyAll();
						this.wait();
					} else if ("2".equals(Thread.currentThread().getName())) {
						System.out.println(Thread.currentThread().getName());
						this.notifyAll();
						this.wait();
					} else if ("3".equals(Thread.currentThread().getName())) {
						System.out.println(Thread.currentThread().getName());
						this.notifyAll();
						this.wait();
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

}

public class PrintSequenceNumbers {

	public static void main(String[] args) {

		Thread printerThread1 = new Thread(new PrinterThread1(), "1");
		Thread printerThread2 = new Thread(new PrinterThread1(), "2");
		Thread printerThread3 = new Thread(new PrinterThread1(), "3");

		printerThread1.start();
		printerThread2.start();
		printerThread3.start();

	}

}
