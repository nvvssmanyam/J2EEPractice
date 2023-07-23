package com.durgasoft.java8;


/*
 *  Interface static methods by default not available to the implementation class
 */
interface Intreface4 {
	public static void m1() {
		System.out.println("Interface static method");
	}
}

public class StaticMethodsDemo {

	public static void main(String[] args) {
		StaticMethodsDemo s = new StaticMethodsDemo();
		// Below both are not accessble
//		s.m1();
//		StaticMethodsDemo.m1();
		Intreface4.m1();
	}
}
