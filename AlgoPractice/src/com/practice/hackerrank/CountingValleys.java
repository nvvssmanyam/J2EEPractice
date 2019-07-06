package com.practice.hackerrank;

public class CountingValleys {

	static int countingValleys(int noOfSteps, String path) {
		int noOfVallys = 0;
		int upHill = 0, downHill = 0;
		char nextStep = ' ';
		boolean isSameAsNextStep = false;

		char[] carr = path.toCharArray();
		for (int i = 0; i < carr.length; i++) {
			isSameAsNextStep = nextStep == carr[i];
			if (carr[i] == 'D')
				downHill++;
			else
				upHill++;

			if (!isSameAsNextStep && downHill == upHill) {
				noOfVallys++;
				upHill = 0;
				downHill = 0;
			}
			nextStep = (i < carr.length-2) ? carr[i+2] : ' ';
		}

		return noOfVallys;

	}

	public static void main(String[] args) {
		System.out.println(countingValleys(12, "DDUUDDUDUUUD"));
	}
	
	/*
	 *     \  /
	 *      \/
	 *
	 *
	 *   _      /\_
	 *    \    /
	 *     \/\/
	 *
	 *
	 **/
	

}
