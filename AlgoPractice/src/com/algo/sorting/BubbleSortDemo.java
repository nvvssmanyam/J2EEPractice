package com.algo.sorting;

import java.util.Arrays;

/*
 *  Bubble Sort is the simplest sorting algorithm that works by repeatedly 
 *  swapping the adjacent elements if they are in wrong order.
 *  
 *  Worst and Average Case Time Complexity: O(n*n). Worst case occurs when array is reverse sorted.
 *  Best Case Time Complexity: O(n). Best case occurs when array is already sorted.
 *  
 */
public class BubbleSortDemo {

	public static void main(String[] args) {

		int[] arr = {25, 10, 15, 5, 1};
		int[] sortedArr = doSort(arr);

		System.out.println(Arrays.toString(sortedArr));
	}

	private static int[] doSort(int[] arr) {
		int len = arr.length;
		int temp;
		
		for(int i=0; i<len; i++) {
			for(int j=i; j<len; j++) {
				// Asceding order
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

}
