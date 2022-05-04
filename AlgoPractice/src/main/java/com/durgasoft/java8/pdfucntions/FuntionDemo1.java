package com.durgasoft.java8.pdfucntions;

import java.util.function.Function;

public class FuntionDemo1 {
	
	public static void main(String[] args) {
		Function<Integer, Integer> f = (num) -> num*num;
		
		System.out.println(f.apply(10));
		System.out.println(f.apply(20));
	}

}
