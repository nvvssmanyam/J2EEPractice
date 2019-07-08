package com.durgasoft.java8;


/*
 *  In multiple inheritance POV we should specify which default method you want
 *  we should override the method, in that we can implement our own code or 
 *  we should specify which default method you wantS
 *  Syn: <Interface name>.super.<Mehtod Name>();
 */
interface Left {
	default void m1() {
		System.out.println("Left m1");
	}
}

interface Right {
	default void m1() {
		System.out.println("Right m1");
	}
}

public class DefaultMethosInMultipleInheritanceDemo implements Left,Right {
	
	public void m1() {
//		System.out.println("My Own implementation");
		Left.super.m1();
	}
	
	public static void main(String[] args) {
		DefaultMethosInMultipleInheritanceDemo d = new DefaultMethosInMultipleInheritanceDemo();
		d.m1();
	}
}
