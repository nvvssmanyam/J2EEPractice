package com.durgasoft.java8.pdfucntions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
	public static void main(String[] args) {
		
		Predicate<Integer> p = I -> I > 10;
		
		Predicate<String> p2 = s -> s.length() > 4;
		
		Predicate<Collection> p3 = c -> c.isEmpty();
		
		System.out.println(p.test(100));
		System.out.println(p2.test("abc"));
		
		List list = new ArrayList();
		System.out.println("Is list is empty: "+p3.test(list));
		
		list.add(10);
		System.out.println("Is list is empty: "+p3.test(list));
	}
}
