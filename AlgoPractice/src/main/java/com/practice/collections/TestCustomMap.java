package com.practice.collections;

public class TestCustomMap {
	
	public static void main(String[] args) {
		
		CustomHashMap<Integer, Integer> map = new CustomHashMap<>();
		
		map.put(1, 10);
		map.put(2, 20);
		map.put(17, 30);
		map.put(33, 40);
		
		System.out.println("Size of map is :: "+map.size());
		
		System.out.println(map.remove(1));
		
		System.out.println("Size of map is :: "+map.size());
	}

}
