package com.practice.hackearth;

import java.util.Arrays;
import java.util.Scanner;

class TestClass {
	
	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);
		int length = Integer.parseInt(sc.nextLine());
		String firstArr = sc.nextLine();
		String secondArr = sc.nextLine();
		
		String[] arr1 = firstArr.split(" ");
		String[] arr2 = secondArr.split(" ");
		
//		int[] array1 = Arrays.stream(arr1).mapToInt(Integer::parseInt).toArray();
//		int[] array2 = Arrays.stream(arr2).mapToInt(Integer::parseInt).toArray();
		
		int[] array1 = new int[length];
		int[] array2 = new int[length];
		
		for(int i=0; i<length; i++) {
			array1[i] = Integer.parseInt(arr1[i]);
			array2[i] = Integer.parseInt(arr2[i]);
		}
		
		int [] resultArray = new int[length];
		
		sumOfTwoArrays(array1, array2, length, resultArray);
		
		System.out.println(Arrays.toString(resultArray));
	}

	private static void sumOfTwoArrays(int[] array1, int[] array2, int length, int[] resultArray) {
		for(int i=0; i<length; i++) {
			resultArray[i] = array1[i]+array2[i];
		}
	}
}