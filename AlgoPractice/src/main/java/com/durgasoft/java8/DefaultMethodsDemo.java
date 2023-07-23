package com.durgasoft.java8;


/*
 *  Default methods won't force you to override method, It's optional
 *  we can override default methods as well
 */
interface Intref3 {
	default void m1() {
		System.out.println("Defalut method");
	}
}

public class DefaultMethodsDemo implements Intref3 {

	public static void main(String[] args) {
		DefaultMethodsDemo d = new DefaultMethodsDemo();
		d.m1();
	}
	
}
