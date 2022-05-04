package com.practice.challenges.recursion;

public class Vinodh {

	public static void main(String[] args) {
		print(1, 10);
	}

	private static int print(int i, int n) {
		if(i==n)
			return n;
		else {
			System.out.println(i);
			return print(i+1, n);
		}
	}

}
