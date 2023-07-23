package com.durgasoft.java8.pdfucntions;

import java.util.function.Consumer;

public class ConsumerDemo1 {
	
	public static void main(String[] args) {
		
		Consumer<Integer> c = (n) -> System.out.println(n*n);
		
		c.accept(10);
	}

}
