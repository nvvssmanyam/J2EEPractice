package com.practice.hackerrank;

public class BreakingRecords {

	// Complete the plusMinus function below.
	static void plusMinus(int[] arr) {
		int tmp;
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		long minSum = 0, maxSum = 0;
		for(int i=0; i<arr.length; i++) {
			if(i != 0) {
				maxSum+=arr[i];
			}
			if(i != arr.length -1) {
				minSum += arr[i];
			}
		}
		System.out.println(minSum +" "+ maxSum);
	}

	public static void main(String[] args) {

		int[] arr = { 1, 4, 3, 2, 5 };

		plusMinus(arr);

	}
}