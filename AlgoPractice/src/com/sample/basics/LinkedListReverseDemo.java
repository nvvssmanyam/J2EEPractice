package com.sample.basics;

import java.util.Arrays;
import java.util.List;

public class LinkedListReverseDemo {
	
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(new Integer[] {1,2,3,4,5});
		
		printNumbersInList(list, 0);
	}

	private static void printNumbersInList(List<Integer> list, int elementsProcessed) {
		while(list.size()-1 > elementsProcessed) {
			printNumbersInList(list, elementsProcessed+1);
			System.out.println(list.get(elementsProcessed));
		}
	}

}
