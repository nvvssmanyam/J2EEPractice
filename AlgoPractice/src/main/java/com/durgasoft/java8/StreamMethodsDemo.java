package com.durgasoft.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethodsDemo {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(5);
		list.add(20);
		list.add(15);
		list.add(25);
		list.add(15);
		
		System.out.println("Is all list items greater than 5 :: "+list.stream().allMatch(i -> (i%5 == 0)));
		
		System.out.println("Is there any items greater than 20 :: "+list.stream().anyMatch(i -> i>20));
		
		List<Integer> resultList = list.stream().map(i->i*2).collect(Collectors.toList());
		System.out.println("After multipied 2 all the list items :: "+resultList);
		
		List<Integer> concatedList = Stream.concat(list.stream(), resultList.stream()).collect(Collectors.toList());
		System.out.println("Concated List :: "+concatedList);
		
		System.out.println("Count of list :: "+list.stream().count());
		
		System.out.println("No of distinct elements in list ::: "+list.stream().distinct().count());
		
		String s = "abc";
		
	}
	
}
