package com.practice.hackerrank;

import java.util.Arrays;

public class GradingStudents {
	
	/*
     * Complete the gradingStudents function below.
     */
    static int[] gradingStudents(int[] grades) {
    	
    	for(int i=0; i<grades.length; i++) {
    		grades[i] = roundWithFive(grades[i]); 
    	}

    	return grades;
    }
	
	static int roundWithFive(int num) {
		
		if(num > 37 && num % 5 > 2) {
			num = 5 * ((num/5) +1);
		}
		return num;
	}

	public static void main(String[] args) {
		
		int[] grades = {73, 67, 38, 33};
		System.out.println(Arrays.toString(gradingStudents(grades)));
	}

}
