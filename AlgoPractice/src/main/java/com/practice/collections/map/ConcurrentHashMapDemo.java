package com.practice.collections.map;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class ConcurrentHashMapDemo {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new ConcurrentHashMap<>();
		
		map.put(1, "VVS");
		map.put(2, "Raja");
		map.put(17, "KAS");
		map.put(15, null);
		System.out.println(map.putIfAbsent(2, "Subbu"));
		System.out.println(map.get(10));
		
		Set<Integer> set = map.keySet();
		for(Integer i : set) {
			System.out.println(i + " "+ map.get(i));
		}
		
		List<Entry<Integer, String>> entrySet = new ArrayList<>(map.entrySet());
		
		entrySet = entrySet.stream().sorted((e1, e2)->e1.getValue().compareTo(e2.getValue())).collect(Collectors.toList());
		
		Map<Integer, String> sortedMap = new LinkedHashMap<>();
		for(Entry<Integer, String> entry : entrySet) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		
		System.out.println(sortedMap);
		
	}

}
