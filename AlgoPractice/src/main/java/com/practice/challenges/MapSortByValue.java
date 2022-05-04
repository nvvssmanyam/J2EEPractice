package com.practice.challenges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapSortByValue {
	
	
	public static void main(String[] args) {
		Map<String, Integer> studentMap = new LinkedHashMap<>();
		studentMap.put("VVS", 22);
		studentMap.put("Ram", 19);
		studentMap.put("Raj", 25);
		
		studentMap = sortByValue(studentMap);
		
		for(Map.Entry<String, Integer> ele : studentMap.entrySet()) {
			System.out.println(ele.getKey() +", "+ele.getValue());
		}
	}

	private static Map<String, Integer> sortByValue(Map<String, Integer> studentMap) {
		
		List<Map.Entry<String, Integer>> studentEntrySet = new ArrayList<>(studentMap.entrySet());
		
		Collections.sort(studentEntrySet, new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		
		Map<String, Integer> sortedMap = new LinkedHashMap<>();
		for(Map.Entry<String, Integer> ele : studentEntrySet) {
			sortedMap.put(ele.getKey(), ele.getValue());
		}
		
		return sortedMap;
	}

}
