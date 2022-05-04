package com.sample.test;

public class Test3 {

	public static void main(String[] args) {
		isPowerOfThree(200, 405);
	}

	private static void isPowerOfThree(long left, long right) {
		int count = 0;
		for(int i=0; i<100; i++) {
			double d = Math.pow(3, i);
			if(d > right) {
				break;
			}
			if(d >= left) {
				System.out.println(d);
				count++;
			}
			
		}
		System.out.println(count);
	}

}
