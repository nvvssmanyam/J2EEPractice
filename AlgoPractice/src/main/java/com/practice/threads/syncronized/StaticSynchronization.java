package com.practice.threads.syncronized;

class Process1 {
	static Object obj = new Object();
	public synchronized void m1() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("In mehtod m1");
	}

	public synchronized void m2() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("In mehtod m2");
	}

	public static synchronized void m3() throws InterruptedException {
		Thread.sleep(10000);
//		synchronized (Process1.class) {
//			obj.wait();
//		}
		System.out.println("In static mehtod m3");
	}
	
	public static synchronized void m4() throws InterruptedException {
		Thread.sleep(10000);
//		synchronized (Process1.class) {
//			obj.wait();
//		}
		System.out.println("In static mehtod m3");
	}

}

public class StaticSynchronization {

	public static void main(String[] args) {
		Process1 proc = new Process1();

		Thread thread1 = new Thread(() -> {
			try {
				System.out.println("Started Thread1 "+System.currentTimeMillis());
				proc.m1();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				System.out.println("M1 completed..." + System.currentTimeMillis());
			}
		});

		Thread thread2 = new Thread(() -> {
			try {
				System.out.println("Started Thread2 "+System.currentTimeMillis());
				proc.m2();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				System.out.println("M2 completed..." + System.currentTimeMillis());
			}
		});

		Thread thread3 = new Thread(() -> {
			try {
				System.out.println("Started Thread3 "+System.currentTimeMillis());
				Process1.m3();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				System.out.println("M3 completed..." + System.currentTimeMillis());
			}
		});
		
		Thread thread4 = new Thread(() -> {
			try {
				System.out.println("Started Thread3 "+System.currentTimeMillis());
				Process1.m4();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				System.out.println("M4 completed..." + System.currentTimeMillis());
			}
		});
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();

		System.out.println("Completed...");

	}

}
