package com.practice.oracle;

import java.util.Arrays;

public class Triplet {
	
	public static void main(String args[]) {
		int[] arr = {1,2,3,4,5};
		int tripletSum = 9;
		
		int[] tripletArr = findTriplet(arr, tripletSum);
		
		System.out.println(tripletArr != null ? Arrays.toString(tripletArr) : null);
	}
	
	private static int[] findTriplet(int[] arr, int tripletSum) {
		int[] tripletArr = null;
		int arrLenght = arr.length;
		for(int i=0; i<arrLenght-2; i++) {
			for(int j=i+1; j<arrLenght-1; j++){
				for(int k=j+1; k<arrLenght; k++) {
					if((arr[i]+arr[j]+arr[k]) == tripletSum) {
						tripletArr = new int[3];
						tripletArr[0] = arr[i];
						tripletArr[1] = arr[j];
						tripletArr[2] = arr[k];
					}
				}
			} 
		}
		return tripletArr;
	}
	
}
