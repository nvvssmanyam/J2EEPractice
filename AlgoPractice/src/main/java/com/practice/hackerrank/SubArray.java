package com.practice.hackerrank;

import java.util.Arrays;
import java.util.stream.IntStream;

/* 
 *   given a List of integers, divide the Array/List into two subset arrays A and B such that the intersection set of A and B will be null 
 *   and union will be the given array.Output is List A. Note that Array A should have less elements than that of B and 
 *   the total sum of elements in A should be greater than total sum of elements in B set. 
 *   
 *   if there are more than one possibilities of Array A, then return the array with maximum sum. 
 */

public class SubArray {

	public static void main(String[] args) {

		int arr[] = { 1, 9, 3, 4, 5, 6, 7, 2, 8, 5, 5 };
		System.out.println("Sum of bigger sub array :: "+getSubArraySum(arr));

	}

	private static int getSubArraySum(int[] arr) {
		int pivot = (arr.length / 2) + 1;
		int[] resultArr = new int[arr.length / 2];

		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		int firstSubArraySum = 0, secondSubArraySum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i < pivot)
				firstSubArraySum += arr[i];
			else
				secondSubArraySum += arr[i];
		}
		System.out.println("First sub array sum :: "+firstSubArraySum);
		System.out.println("Second sub array sum :: "+secondSubArraySum);
		if (secondSubArraySum > firstSubArraySum) {
			int sum =0;
			for(int i=pivot; i<arr.length; i++) {
				System.out.print(arr[i]+" ");
				sum += arr[i];
			}
			return sum;
		}			
		else
			return 0;
	}

}
