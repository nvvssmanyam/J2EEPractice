package com.practice.exceptions;

public class ExceptionWithThrowAndThrows {

	public static void main(String[] args) throws Exception {
		System.out.println(sum(10,20));
	}

	private static int sum(int i, int j) throws NullPointerException {

		if(i==10)
			throw new NullPointerException();
		return i+j;
	}

}
