package com.loonycorn.dsalgo.sorting;

import java.util.Arrays;

public class BubbleSortDemo {

	public static void main(String[] args) {
		int[] arr = { 4, 5, 8, 9, 1, 6, 3, 7, 2 };
		sort(arr);
	}

	private static void sort(int[] arr) {
		int len = arr.length;

		for (int i = 0; i < len; i++) {
			boolean swapped = false;
			for (int j = len - 1; j > i; j--) {
				if (arr[j] < arr[j - 1]) {
					swap(arr, j, j - 1);
					swapped = true;
				}
			}
			if(!swapped) {
				System.out.println("sorted after "+i+" iterations");
				break;
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
