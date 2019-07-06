package com.practice.hackerrank;

public class AngryProfessor {
	
	// Complete the angryProfessor function below.
    static String angryProfessor(int threshold, int[] studentTimings) {
    	int studentPresentOnTime = 0;
    	for(int i=0; i<studentTimings.length; i++) {
    		if(studentTimings[i] <= 0)
    			studentPresentOnTime++;
    	}

    	return studentPresentOnTime >= threshold ? "NO" : "YES";
    }
	
	public static void main(String[] args) {
		int studentTimings[] = {-1, -1, 1, -1};
		System.out.println(angryProfessor(1, studentTimings));
	}

}
