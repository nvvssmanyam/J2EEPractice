package com.practice.threads;

class Display {

	public synchronized void wish(String name) {
		System.out.println("Hi "+name+" Good Mng...");
		try {
			this.wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Bye "+name+" Good Night...");
	}
	
}

class MyThread extends Thread {

	Display disp;
	String name;
	
	public MyThread(Display disp, String name) {
		this.disp = disp;
		this.name = name;
	}
	
	@Override
	public void run() {
		disp.wish(name);
	}
	
	
}

public class WaitAndNotifyAllDemo1 {

	public static void main(String[] args) {
		
		Display d1 = new Display();
		Thread t1 = new MyThread(d1, "Subbu");
		t1.start();
		
		try {
			Thread.sleep(4000);
			synchronized (d1) {
				System.out.println("Giving signal...");
				d1.notifyAll();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
