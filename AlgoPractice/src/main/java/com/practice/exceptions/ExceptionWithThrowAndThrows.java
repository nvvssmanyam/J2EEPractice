package com.practice.exceptions;

public class ExceptionWithThrowAndThrows {

	public static void main(String[] args) throws Exception {
		System.out.println(sum(10, 20));
	}

	private static int sum(int i, int j) throws NullPointerException {

		try {
			if (i == 10) {
				throw new NullPointerException();
			}
		} catch (NullPointerException ne) {
			ne.printStackTrace();
			throw new NullPointerException();
		} finally {
			return i + j;
		}
	}

}
