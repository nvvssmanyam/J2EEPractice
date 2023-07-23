package com.sample.basics;

import java.util.Arrays;

public class CandiesDistribution {

	
	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(toffee(10, 3)));
		
	}
	
	public static int[] toffee(int input1, int input2) {
		int[] outputArr = new int[input2];
		int noOfCandiesLeft = input1;
		int lastDistCandies = 0;
		for(int i=0; i<input2 && noOfCandiesLeft>0 ;i++) {
			outputArr[i] = outputArr[i] + (noOfCandiesLeft > lastDistCandies+1 ? lastDistCandies+1 : noOfCandiesLeft);
			noOfCandiesLeft -= (lastDistCandies+1);
			i = (i == (input2-1) && noOfCandiesLeft > 0) ? -1 : i;
			lastDistCandies = lastDistCandies+1;
		}
		
		return outputArr;
	}
}
