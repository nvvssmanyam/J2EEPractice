package com.practice.threads.syncronized;

class NumbersThread implements Runnable {

	boolean first = true, second = false, third = false;

	@Override
	public void run() {
		synchronized (this) {

			for (int i = 1; i <= 10; i++) {
				System.out.print(i + " ");

				try {
					if (first) {
						first = false;
						second = true;
						third = false;
						this.notifyAll();
						this.wait();
					} else if (second) {
						first = false;
						second = false;
						third = true;
						this.notifyAll();
						this.wait();
					} else if (third) {
						first = true;
						second = false;
						third = false;
						this.wait();
						this.notifyAll();
						System.out.println();
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		}
	}

}

public class WaitAndNotifyAllDemo {

	public static void main(String[] args) {

		Runnable runnable = new NumbersThread();

		Thread thread1 = new Thread(runnable, "T1");
		Thread thread2 = new Thread(runnable, "T2");
		Thread thread3 = new Thread(runnable, "T3");

		thread1.start();
		thread2.start();
		thread3.start();

	}

}
