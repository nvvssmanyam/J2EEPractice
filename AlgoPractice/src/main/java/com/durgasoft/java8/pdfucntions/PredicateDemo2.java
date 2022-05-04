package com.durgasoft.java8.pdfucntions;

import java.util.function.Predicate;

/*
 *  WAP to display names start with 'K' by using predicate
 * 
 */
public class PredicateDemo2 {
	
	public static void main(String[] args) {
		
		String names[] = {"Kaja", "King", "Raju", "Ram", "Kiran"};
		
		Predicate<String> p = (name) -> name.startsWith("K");
		
		for(int index=0; index<names.length; index++) {
			if(p.test(names[index])) {
				System.out.println(names[index]);
			}
		}
		
	}

}
