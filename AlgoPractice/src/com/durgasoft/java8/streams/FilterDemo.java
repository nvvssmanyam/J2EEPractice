package com.durgasoft.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(15);
		list.add(5);
		list.add(20);
		
		System.out.println(list);
		
		//Make list for only even numbers
//		List<Integer> evenNumList = list.stream().filter(n -> n%2 == 0).collect(Collectors.toList());
		
		System.out.println(list.stream().filter(n -> n%2 == 0).map(n -> n+10).collect(Collectors.toList()));
		
//		evenNumList.stream().forEach((n)->System.out.println(n));
//		System.out.println("Even Numbers list :: "+evenNumList);
		
	}

}
