package com.loonycorn.dsalgo.sorting;

import java.util.Arrays;

public class SelectionSortDemo2 {

	public static void main(String[] args) {

		int[] arr = { 4, 7, 2, 9, 6, 1, 5, 3, 8 };

		selectionSort(arr);

	}

	private static void selectionSort(int[] arr) {

		int len = arr.length;

		for (int i = 0; i < len - 1; i++) {
			for (int j = i + 1; j < len; j++) {
				if (arr[i] > arr[j]) {
					swap(arr, i, j);
				}
			}
		}
		print(arr);

	}

	private static void print(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}

	private static void swap(int[] arr, int i, int j) {
		arr[i] = arr[i] + arr[j];
		arr[j] = arr[i] - arr[j];
		arr[i] = arr[i] - arr[j];
	}

}
