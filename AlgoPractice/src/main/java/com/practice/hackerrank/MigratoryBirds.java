package com.practice.hackerrank;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MigratoryBirds {

	static int migratoryBirds(List<Integer> arr) {
		
		Collections.sort(arr, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2.compareTo(o1);
			}			
		});
		
		
		int count = 0;
		int min = arr.get(0);
		Integer value;
		Integer key;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.size(); i++) {
			key = arr.get(i);
			value = map.get(arr.get(i));
			if (value != null) {
				value += 1;
				if (value >= count) {
					count = value;
					min = arr.get(i);
				}
			}
			map.put(arr.get(i), value == null ? 1 : value);
		}
		
		return min;
	}

	public static void main(String[] args) {

		Integer[] arr = { 1, 4, 4, 4, 5, 3, 1, 1};

		List<Integer> list = Arrays.asList(arr);

		System.out.println(migratoryBirds(list));
	}
}