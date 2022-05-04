package com.algo.sorting;

import java.util.Arrays;

public class InsertionSortDemo {
	
	public static void main(String[] args) {

		int[] arr = {25, 10, 15, 5, 1};
		int[] sortedArr = doSort(arr);

		System.out.println(Arrays.toString(sortedArr));
	}

	private static int[] doSort(int[] arr) {
		
		int len = arr.length;
		int temp;
		int count = 0;
		System.out.println("Before starting : "+Arrays.toString(arr));
		for (int i = 1; i < len; i++) {
			int val = arr[i];
			for (int j = i-1; j >= 0; j--) {
				if(arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				count++;
				System.out.println("Iteration "+count+" : "+Arrays.toString(arr));
			}
			
		}
		
		return arr;
	}

}
