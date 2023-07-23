package com.loonycorn.dsalgo.sorting;

import java.util.Arrays;

public class MergeSortJavaDemo {

	/**
	 * Tuning parameter: list size at or below which insertion sort will be used in
	 * preference to mergesort. To be removed in a future release.
	 */
	private static final int INSERTIONSORT_THRESHOLD = 7;

	public static void main(String[] args) {
		Integer[] arr = new Integer[] { 8, 7, 5, 1, 3, 6, 4, 9, 2 };
		Integer[] dest = arr.clone();
		
		mergeSort(arr, dest, 0, arr.length, 0);
		System.out.println(Arrays.toString(arr));
	}

	private static void mergeSort(Object[] src, Object[] dest, int low, int high, int off) {
		int length = high - low;

		// Insertion sort on smallest arrays
		if (length < INSERTIONSORT_THRESHOLD) {
			for (int i = low; i < high; i++)
				for (int j = i; j > low && ((Comparable) dest[j - 1]).compareTo(dest[j]) > 0; j--)
					swap(dest, j, j - 1);
			return;
		}

		// Recursively sort halves of dest into src
		int destLow = low;
		int destHigh = high;
		low += off;
		high += off;
		int mid = (low + high) >>> 1;
		mergeSort(dest, src, low, mid, -off);
		mergeSort(dest, src, mid, high, -off);

		// If list is already sorted, just copy from src to dest. This is an
		// optimization that results in faster sorts for nearly ordered lists.
		if (((Comparable) src[mid - 1]).compareTo(src[mid]) <= 0) {
			System.arraycopy(src, low, dest, destLow, length);
			return;
		}

		// Merge sorted halves (now in src) into dest
		for (int i = destLow, p = low, q = mid; i < destHigh; i++) {
			if (q >= high || p < mid && ((Comparable) src[p]).compareTo(src[q]) <= 0)
				dest[i] = src[p++];
			else
				dest[i] = src[q++];
		}
	}

	/**
	 * Swaps x[a] with x[b].
	 */
	private static void swap(Object[] x, int a, int b) {
		Object t = x[a];
		x[a] = x[b];
		x[b] = t;
	}

}
