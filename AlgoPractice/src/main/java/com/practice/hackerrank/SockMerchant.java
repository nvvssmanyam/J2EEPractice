package com.practice.hackerrank;

import java.util.Arrays;

public class SockMerchant {
	
	static int sockMerchant(int n, int[] ar) {

		Arrays.sort(ar);
		System.out.println(Arrays.toString(ar));
		int perfectPairs = 0;

		Integer occurence = 0, key = ar[0]; 
		for(int i=0; i<n; i++) {
			boolean isLast = i == n-1;
			if(key != ar[i] || isLast) {
				occurence= isLast && key == ar[i] ? occurence+1: occurence;
				System.out.println("Occu - "+occurence);
				perfectPairs = perfectPairs+occurence/2;
				System.out.println("Pairs - "+perfectPairs);
				occurence = 0;
			}
			occurence++;
			key = ar[i];
			System.out.println("Key -- "+key+"  :: Occurence -- "+occurence);
		}
		
		return perfectPairs;
    }
	
	public static void main(String[] args) {
		
		int[] arr = {10, 50, 10, 20, 50};
		
		System.out.println(sockMerchant(arr.length, arr));
	}

}
