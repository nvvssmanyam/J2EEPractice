package com.practice.challenges.recursion;

public class PrintNumbers {

	public static void main(String[] args) {
		printNumber(10);
	}

	private static void printNumber(int limit) {
		
		if(limit > 1) {
			printNumber(limit-1);
		}
		System.out.println(limit);
	}
	
}
