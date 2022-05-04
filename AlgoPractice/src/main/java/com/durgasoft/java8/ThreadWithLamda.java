package com.durgasoft.java8;

public class ThreadWithLamda {

	public static void main(String[] args) {
		Runnable r = () -> System.out.println("Inside run method");
		Thread t = new Thread(r);
		
		t.start();
	}

}
