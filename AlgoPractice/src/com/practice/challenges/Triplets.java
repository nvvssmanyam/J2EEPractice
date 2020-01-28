package com.practice.challenges;

import java.util.Arrays;

public class Triplets {

	public static void main(String[] args) {
		
		int[] arr = {2,3,4,1,5};
		findTriplets(arr, 11);
		
	}

	private static void findTriplets(int[] arr, int givenSum) {
		Arrays.sort(arr);
		int pairSum = 0;
		for(int i=0; i<arr.length-2; i++) {
			pairSum = givenSum - arr[i];
			for(int j=i+2; j<arr.length; j++) {
				if(arr[i+1]+arr[j] == pairSum) {
					System.out.println("Pair found : "+arr[i]+" "+arr[i+1]+" "+arr[j]);
				}
			}
		}
	}
	
}
