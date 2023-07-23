package com.practice.hackerrank;

public class DivisibleSumPairs {
	
	static int divisibleSumPairs(int lenghtOfArray, int divisor, int[] ar) {

		int sumPairs = 0;
		
		for(int i=0; i<lenghtOfArray; i++) {
			for(int j=i+1; j<lenghtOfArray; j++) {
				System.out.println(ar[i] + " + "+ar[j] + " :: "+divisor);
				if((ar[i]+ar[j]) % divisor == 0) {
					sumPairs++;
				}
			}
		}
		
		return sumPairs;
    }
	
	public static void main(String[] args) {
		int[] arr = {1, 3, 2, 6, 1, 2};
		System.out.println(divisibleSumPairs(6, 3, arr));
	}

}
