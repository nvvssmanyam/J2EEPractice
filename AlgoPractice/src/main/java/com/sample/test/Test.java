package com.sample.test;

import javax.management.RuntimeErrorException;

public class Test {

	public static void main(String[] args) {
		
		try {
			badMethod();
			System.out.println("A");
		}
		catch(Exception e) {
			System.out.println("B");
		} finally {
			System.out.println("C");
		}
		System.out.println("D");
	}

	private static void badMethod() {
		// TODO Auto-generated method stub
		throw new RuntimeException();
		
	}

}
