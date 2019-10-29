package com.loonycorn.dsalgo.sorting;

import java.util.Arrays;

public class MergeSortDemo {

	public static void main(String[] args) {
		int[] arr = { 4, 5, 8, 9, 1, 6, 3, 7, 2 };
		sort(arr);
	}

	private static void sort(int[] arr) {
		mergeSort(arr);
		print(arr);
	}
	
	private static void mergeSort(int[] arr) {
		int mid = arr.length/2;
//		int[] left = 
		
	}

	private static void swap(int[] arr, int i, int j) {
		arr[i] = arr[i] + arr[j];
		arr[j] = arr[i] - arr[j];
		arr[i] = arr[i] - arr[j];
	}

	private static void print(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}

}
