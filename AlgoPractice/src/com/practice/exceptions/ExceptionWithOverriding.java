package com.practice.exceptions;

import java.io.IOException;

class A {
	void m1() throws IOException {
		System.out.println("In method m1 of A");
	}
}

class B extends A {
	
	/* 
	 *  Exception IOException(Checked) is not compatible with throws clause, If super method not throwing any checked exception
	 *  Exception RuntimeException(Un-Checked) no issue we can use any unchecked exceptions
	 *  @see com.practice.exceptions.A#m1()
	 */
	@Override
	void m1() throws RuntimeException {
		System.out.println("In method m1 of A");
	}
}

public class ExceptionWithOverriding {

}
