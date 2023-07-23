package com.practice.challenges;

import java.util.Arrays;

public class TripletsDemo2 {

	public static void main(String[] args) {
		
		int[] arr = {2,3,4,1,6,5};
		findTriplets(arr, 11);
		
	}

	private static void findTriplets(int[] arr, int sum) {
		Arrays.sort(arr);
		int start = 0, end =0; 
		for(int i=0; i<arr.length-2;i++) {
			start = i+1;
			end = arr.length - (i+1);
			while(start > end) {
				
			}
		}
		
	}

}
