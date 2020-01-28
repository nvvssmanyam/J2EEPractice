package com.practice.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIteration {
	
	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "Subbu");
		map.put(2, "Varma");
		map.put(3, "Raju");
		map.put(4, "Salana");
		
		// Iterating over entries using For-Each loop
		
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : "+entry.getValue());
		}
		
		Iterator it = map.entrySet().iterator();
		
		while(it.hasNext()) {
			Map.Entry<Integer, String> entry = (Map.Entry<Integer, String>) it.next();
			System.out.println(entry.getKey() + " : "+entry.getValue());
		}
		
		map.forEach((k, v) -> System.out.println(k + " : "+v));
		
	}

}
