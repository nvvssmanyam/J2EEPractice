package com.sample.basics;

public class MissingMarble {

	public static void main(String[] args) {
		int[] arr = {1,3,7,9,11};
		System.out.println(missingMarble(5, arr));
	}
	
	public static int missingMarble(int input1, int[] input2) {
		
		int marblesInTwoBowls = input2[0]+input2[input1-1];
		for(int i=0; i<=input1/2; i++) {
			System.out.println(input2[i]+" "+input2[input1-(i+1)]+" :: "+input2[i]+input2[input1-(i+1)]);
			System.out.println(input2[i]+input2[input1-(i+1)]);
			if(marblesInTwoBowls != input2[i]+input2[input1-(i+1)]) {
				return marblesInTwoBowls - input2[i];
			}
		}
		
		return 0;
	}

}
