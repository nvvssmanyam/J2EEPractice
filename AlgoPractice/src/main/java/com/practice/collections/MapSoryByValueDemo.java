package com.practice.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapSoryByValueDemo {

	public static void main(String[] args) {

		Map<Integer, Integer> map = new LinkedHashMap<>();
		map.put(4, 40);
		map.put(2, 20);
		map.put(1, 50);
		map.put(5, 10);
		
		System.out.println(map.get(10));
		
		List<Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
		
		Comparator<Entry<Integer, Integer>> compartor = new Comparator<Map.Entry<Integer,Integer>>() {
			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		};
		
		Collections.sort(list,compartor);
		
		// Here I am copying the sorted list in HashMap
	       // using LinkedHashMap to preserve the insertion order
	       HashMap sortedHashMap = new LinkedHashMap();
	       for (Iterator it = list.iterator(); it.hasNext();) {
	              Map.Entry entry = (Map.Entry) it.next();
	              sortedHashMap.put(entry.getKey(), entry.getValue());
	       } 
		
		System.out.println(sortedHashMap);
		
	}

}
