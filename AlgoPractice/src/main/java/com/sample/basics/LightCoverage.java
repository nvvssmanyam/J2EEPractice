package com.sample.basics;

public class LightCoverage {

	
	public static void main(String[] args) {
		
		int[][] arr = {{5, 10}, {8,12}};
		System.out.println(coverage(2, arr));
		
	}
	
	public static int coverage(int input1, int[][] input2) {
		int distanceCovered = 0;
		int previousCoverage = 0;
		for(int i=0; i<input1; i++) {
			if(previousCoverage <= input2[i][0]) {
				distanceCovered += input2[i][1] - input2[i][0];
			} else {
				distanceCovered = distanceCovered + (input2[i][0] - previousCoverage)+(input2[i][1] - input2[i][0]);
			}
			previousCoverage = input2[i][1];
		}

		return distanceCovered;	
		//throw new UnsupportedOperationException("coverage(int input1,int[][] input2)");
	}
}
