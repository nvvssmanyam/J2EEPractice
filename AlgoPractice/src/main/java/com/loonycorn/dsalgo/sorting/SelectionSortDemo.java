package com.loonycorn.dsalgo.sorting;

import java.util.Arrays;

public class SelectionSortDemo {

	public static void main(String[] args) {
		int[] arr = {4,5,8,9,1,6,3,7,2};
		sort(arr);
	}

	private static void sort(int[] arr) {
		int len = arr.length;
		
		for (int i = 0; i < len-1; i++) {
			for(int j=i+1; j<len; j++) {
				if(arr[i] > arr[j]) {
					swap(arr, i, j);
				}
			}
		}
		print(arr);
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
