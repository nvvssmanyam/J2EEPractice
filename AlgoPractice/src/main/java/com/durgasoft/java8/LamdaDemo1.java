package com.durgasoft.java8;

interface Interf {
	public int squareIt(int n);
}

public class LamdaDemo1 {
	
	public static void main(String[] args) {
		
		/*
		 *  If only one param in method signature peranthasis are optional
		 *  no need of return and only one statement curly also not optional
		 */
		/* Interf i = (int n) -> {
			return n*n;
		}; */
		
		// Shortest form of lamda
		Interf i = n -> n*n;
		
		System.out.println(i.squareIt(10));
		System.out.println(i.squareIt(20));
	}
	
}
