package com.practice.oracle;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo {
	
	public static void main(String[] args) {
		Integer[] arr = {1, 2, 6, 9, 3, 8};
		List<Integer> list = Arrays.asList(arr);
		
		List<Integer> resultList = list.stream().filter(n -> n >= 5).collect(Collectors.toList());
		System.out.println(resultList);
	}

}
