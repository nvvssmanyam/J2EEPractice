package com.sample.test;

public class Test2 {

	static String str;
	public void Test2() {
		System.out.println("In COn");
		str = "Hello";
	}
	
	public static void main(String[] args) {
		Test2 tet = new Test2();
		System.out.println(str);
	}

}
