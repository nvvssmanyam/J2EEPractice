package com.algo.sorting;

import java.util.Arrays;

interface A {
	void m1();
}

class C {
	public void m1() {
		System.out.println("C :: m1");
	}
}

public class Test extends C implements A {

	public static void main(String[] args) {
		
		(new Test()).m1();

		String str = "Hi this is chanti, How are you?";
		System.out.println(Arrays.toString(str.split(",")));
		System.out.println(Arrays.toString(str.split(" ")));
	}

}
