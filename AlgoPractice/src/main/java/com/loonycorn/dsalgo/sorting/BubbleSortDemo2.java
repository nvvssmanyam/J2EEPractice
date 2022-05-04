package com.loonycorn.dsalgo.sorting;

import java.util.Arrays;

public class BubbleSortDemo2 {

	public static void main(String[] args) {
		int[] arr = { 4, 7, 2, 9, 6, 1, 5, 3, 8 };
		bubbleSort(arr);
	}

	private static void bubbleSort(int[] arr) {
		int len = arr.length;
		
		for(int i=0; i<len; i++) {
			for(int j=len-1; j>i; j--) {
				if(arr[j] < arr[j-1]) {
					swap(arr, j, j-1);
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	private static void swap(int[] arr, int j, int i) {
		arr[j] = arr[j]+arr[i];
		arr[i] = arr[j]-arr[i];
		arr[j] = arr[j]-arr[i];
	}

}
