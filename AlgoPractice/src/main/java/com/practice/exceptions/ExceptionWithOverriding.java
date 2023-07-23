package com.practice.exceptions;

import java.io.IOException;

class A {
	protected void m1() throws IOException {
		System.out.println("In method m1 of A");
	}
}

class B extends A {
	
	/* 
	 *  Exception IOException(Checked) is not compatible with throws clause, If super method not throwing any checked exception
	 *  Checked exceptions as well should not be parent in child, It should be same level or child exception in child class
	 *  Exception RuntimeException(Un-Checked) no issue we can use any unchecked exceptions
	 *  
	 *  Visibility
	 *  Visibility should not reduce, it can be same level or upper level 
	 *  Ex:public -> public valid, public -> protected not valid
	 *  
	 *  @see com.practice.exceptions.A#m1()
	 */
	@Override
	public void m1() throws RuntimeException {
		System.out.println("In method m1 of A");
	}
}

public class ExceptionWithOverriding {

}
