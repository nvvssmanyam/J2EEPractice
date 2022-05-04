package com.practice.algos;

public class BSTDemo {
	
	static void searchElement(int[] arr, int ele) {
		find(arr, ele, 0, arr.length-1);
	}
	
	static void find(int[] arr, int ele, int left, int right) {
		int mid = (left+right)/2;
		System.out.println("Left :: "+left+ "  right :: "+right + "  mid :: "+mid);
		if(arr[mid] < ele)
			left = mid+1;
		else if(arr[mid] > ele)
			right = mid -1;
		else {
			System.out.println("Element found : "+arr[mid] + " in location : "+mid);
			return;
		}
		
		if(left <= right) {
			System.out.println("In If Left :: "+left+ "  right :: "+right + "  mid :: "+mid);
			find(arr, ele, left, right);
		}
		
	}
	
	public static void main(String[] args) {
		int[] arr = {2,4,6,8,10,12};
		searchElement(arr, 10);
	}

}
