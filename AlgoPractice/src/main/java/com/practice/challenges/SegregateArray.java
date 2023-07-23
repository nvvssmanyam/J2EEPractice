package com.practice.challenges;

import java.util.Arrays;

/*
 *  Dutch national flag problem
 */
public class SegregateArray {

	public static void main(String[] args) {
		
		int[] arr = {0,1,2,0,1,2,1,1,0,2};
		System.out.println(Arrays.toString(segregateArray(arr)));
	}

	private static int[] segregateArray(int[] arr) {
		
		int left=0, right=arr.length -1, mid=0;
		System.out.println("L M R a[mid]");
		while(mid <= right) {
			System.out.println(left + " "+ mid + " "+right+" "+arr[mid]);
			System.out.println(Arrays.toString(arr));
			
			switch (arr[mid]) {
				case 0 :
					arr[left] = arr[left] + arr[mid];
					arr[mid] = arr[left] - arr[mid];
					arr[left] = arr[left] - arr[mid];
					left++;mid++;
					break;
				case 1 :
					mid++;
					break;
				case 2 :
					arr[right] = arr[right] + arr[mid];
					arr[mid] = arr[right] - arr[mid];
					arr[right] = arr[right] - arr[mid];
					right--;
					break;
			}
		}
		return arr;
	}

}
