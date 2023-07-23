package com.practice.threads;

class printingThread implements Runnable {
	volatile int n = 1;
	private static boolean first = true;
	private static boolean second = false;
	Object lock = new Object();

	public void run() {
//		System.out.println("Thread " + Thread.currentThread().getName() + " started");
		try {
			while (n <= 10) {
				synchronized (lock) {
					if(first && Thread.currentThread().getName().equals("T1")) {
						print();
						first = false;
						second = true;
						lock.notify();
						lock.wait();
					} else if(second && Thread.currentThread().getName().equals("T2")) {
						print();
						first = true;
						second = false;
						lock.notify();
						lock.wait();
					}
					Thread.sleep(1000);
//					System.out.println(Thread.currentThread().getName()+ "  :: "+Thread.currentThread().getState());
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private void print() {
		System.out.println(Thread.currentThread().getName()+ "  :: "+Thread.currentThread().getState());
		System.out.println(Thread.currentThread().getName()+" printed :: "+n);
		n++;
	}
}

public class SequenceNumbers {

	public static void main(String[] args) {
		Thread t1 = new Thread(new printingThread(), "T1");
		Thread t2 = new Thread(new printingThread(), "T2");

		t1.start();
		t2.start();
	}

}
