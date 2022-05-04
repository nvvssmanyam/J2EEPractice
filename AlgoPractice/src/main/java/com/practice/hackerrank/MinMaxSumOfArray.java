package com.practice.hackerrank;

public class MinMaxSumOfArray {

	// Complete the plusMinus function below.
	static int[] plusMinus(int[] scores) {
		int worse = 0, best = 0;
		int worstRecord = scores[0], bestRecord = scores[0];
		for(int i=1; i<scores.length; i++) {
			if (worstRecord > scores[i]) {
				worstRecord = scores[i];
				worse++;
			}
			
			if(bestRecord < scores[i]) {
				bestRecord = scores[i];
				best++;
			}
		}
		int[] result = {best,worse};
		return result;
	}

	public static void main(String[] args) {

		int[] arr = { 10, 5, 20, 20, 4, 5, 2, 25, 1};

		plusMinus(arr);

	}
}