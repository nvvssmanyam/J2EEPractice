package com.practice.hackerrank;

public class ElectronicsShop {
	
	/*
     * Complete the getMoneySpent function below.
     */
    static int getMoneySpent(int[] keyboards, int[] drives, int budget) {
    	int maxPossibleAmount = -1;
    	int pairAmount = 0;
    	for(int i=0; i<keyboards.length; i++) {
    		for(int j=0; j<drives.length; j++) {
    			pairAmount = keyboards[i]+drives[j];
    			maxPossibleAmount = (pairAmount <= budget) && (maxPossibleAmount < pairAmount) ? pairAmount : maxPossibleAmount;
    		}
    	}
    	
    	return maxPossibleAmount;
    }
	
	public static void main(String[] args) {
		int[] keyboards = {3, 2};
		int[] drives = {5, 2, 8};
		System.out.println(getMoneySpent(keyboards, drives, 10));
	}

}
