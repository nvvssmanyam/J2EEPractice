package com.durgasoft.java8.streams;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Stream;

public class SortByValueDemo {
	
	public static void main(String[] args) {
		
		Map<Integer, Integer> map = new HashMap<>();
		map.put(1, 10);
		map.put(4, 40);
		map.put(2, 5);
		map.put(3, 15);
		
		List<Map.Entry<Integer, Integer>> set = (List<Entry<Integer, Integer>>) map.entrySet();
		Comparator<Integer> comp = (i1, i2) -> i1.compareTo(i2);
//		set.stream().sorted((comp);
		
//		Stream<Entry<Integer, Integer>> sorted = map.entrySet().stream().sorted((o1, o2) -> (o1+o2));
		
	}

}
