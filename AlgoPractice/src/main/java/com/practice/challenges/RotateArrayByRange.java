package com.practice.challenges;

import java.util.Arrays;

public class RotateArrayByRange {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6};
		
		rotate(arr, 2, arr.length);
		
	}

	private static void rotate(int[] arr, int noOfElements, int length) {
		int tmpArr[] = new int[length];
		int index = 0;
		for(int i=noOfElements; i<length; i++) {
			tmpArr[index] = arr[i];
			index++;
		}
		for(int i=0; i<noOfElements; i++) {
			System.out.println(index);
			tmpArr[index] = arr[i];
			index++;
		}
		
		System.out.println(Arrays.toString(tmpArr));
	}

}
