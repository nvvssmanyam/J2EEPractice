package com.practice.challenges;

import java.util.Arrays;

public class SortArrayTwoUniqueElements {
	
	public static void main(String[] args) {
		
		int[] arr = {0,1,0,1,0,1,0,1,1,1,0,0,0};
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(sortArray(arr)));
		
	}

	private static int[] sortArray(int[] arr) {
		int noOfEle = arr.length;
		int frontIndex = 0;
		int endIndex = noOfEle - 1;
		
		int[] tempArr = new int[noOfEle];
		
		for(int i=0; i<noOfEle; i++) {
			if(arr[i] == 0) {
				tempArr[frontIndex] = arr[i];
				frontIndex++;
			} else {
				tempArr[endIndex] = arr[i];
				endIndex--;
			}
		}
		return tempArr;
	}

}
