package com.practice.hackerrank;

import java.util.HashMap;
import java.util.Map;

public class BirthdayChocolate {

	// Complete the plusMinus function below.
	static void plusMinus(int[] arr) {
		int max = 0;
		Integer ele = 0;
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<arr.length; i++) {
			max = arr[i] > max ? arr[i] : max;
			ele = map.get(arr[i]);
			map.put(arr[i], ele == null ? 1 : ele+1);
		}
		System.out.println(map.get(max));
	}

	public static void main(String[] args) {

		int[] arr = { 1, 4, 3, 2, 5, 5 };

		plusMinus(arr);

	}
}