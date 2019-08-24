package com.practice.oracle;

import java.util.Arrays;

public class RemoveRepeated {
	
	public static void main(String args[]) {
		int[] arr = {1, 2, 2, 3, 4};
		
		System.out.println(Arrays.toString(getUniqueElements(arr)));
 	}
	
	public static int[] getUniqueElements(int[] arr) {
		int[] resultArr = new int[arr.length];
		Arrays.sort(arr);
		int prev = 0;
		int index = 0;
		for(int i=0; i<arr.length; i++) {
			if((i == arr.length-1 || arr[i] != arr[i+1]) && prev != arr[i]) {
				resultArr[index] = arr[i];
				index++;
			}
			prev = arr[i];
		}
		
		return resultArr;
	}
	
}
