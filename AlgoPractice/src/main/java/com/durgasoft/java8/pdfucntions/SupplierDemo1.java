package com.durgasoft.java8.pdfucntions;

import java.util.function.Supplier;

public class SupplierDemo1 {

	public static void main(String[] args) {
		Supplier<Double> s = () -> Math.random();
		
		System.out.println(s.get());
	}
	
}
