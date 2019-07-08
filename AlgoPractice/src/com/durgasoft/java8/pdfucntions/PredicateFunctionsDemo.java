package com.durgasoft.java8.pdfucntions;

import java.util.function.Predicate;

public class PredicateFunctionsDemo {
	
	public static void main(String[] args) {
		int[] arr = {4, 5, 9, 10, 15, 20};
		PredicateFunctionsDemo test = new PredicateFunctionsDemo();
		
		// To check given number greater than 10 or not
		Predicate<Integer> p1 = n -> n > 10;
		
		// To check given number is even or not
		Predicate<Integer> p2 = n -> n%2 == 0;
		
		System.out.println("Numbers grate than 10");
		test.m1(p1, arr);
		
		System.out.println("Numbers less than 10");
		test.m1(p1.negate(), arr);
		
		System.out.println("Number grate than 10 and even numbers");
		test.m1(p1.and(p2), arr);
		
		System.out.println("Number grate than 10 or even numbers");
		test.m1(p1.or(p2), arr);
		
	}
	
	public void m1(Predicate<Integer> p, int[] arr) {
		for(int ind = 0; ind <arr.length; ind++) {
			if(p.test(arr[ind])) {
				System.out.println(arr[ind]);
			}
		}
	}

}
