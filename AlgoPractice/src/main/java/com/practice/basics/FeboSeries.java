package com.practice.basics;

public class FeboSeries {
	
	public static void main(String[] args) {
		
		String s = "VVS";
		System.out.println((new StringBuffer(s)).reverse());
		
		for(int i=1; i<=10; i++) {
			System.out.print(febonaci(i) + " ");
		}
	}

	private static int febonaci(int number) {
		
		if(number ==1 || number==2) {
			return 1;
		}
		
		return febonaci(number -1) + febonaci(number -2);
	}

}
