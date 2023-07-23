package com.practice.challenges;

public class FindSecondHeighest {

	public static void main(String[] args) {
		int[] arr = {1,3,6,9,5,3,12,2};
		
		int max = arr[0], sMax = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i] > max) {
				sMax = max;
				max = arr[i];
			}
			
			else if(arr[i] > sMax && arr[i] != max) {
				sMax = arr[i];
			}
		}
		
		System.out.println(max + "  "+sMax);
	}

}
