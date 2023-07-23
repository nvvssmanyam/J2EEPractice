package com.durgasoft.java8.streams;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo2 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(20);
		list.add(10);
		list.add(15);
		list.add(25);
		
		//Take all even numbers
		List<Integer> prossedList = list.stream().filter(i -> i%2 == 0).collect(Collectors.toList());
		
		//Sort prossedList
		List<Integer> sortedList = prossedList.stream().sorted((c1, c2) -> c1.compareTo(c2)).collect(Collectors.toList());
		
		sortedList.stream().forEach(System.out::println);
		
		List<Integer> llist = new LinkedList<>(list);
		System.out.println(llist.indexOf(10));
		
		System.out.println(10<<1);
	}
	
}
