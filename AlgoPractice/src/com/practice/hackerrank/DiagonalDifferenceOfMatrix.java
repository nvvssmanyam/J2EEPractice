package com.practice.hackerrank;
import java.io.IOException;

public class DiagonalDifferenceOfMatrix {

    // Complete the diagonalDifference function below.
    static int diagonalDifference(int[][] arr) {
    	int digSum = 0, revDigSum = 0;
    	for(int row=0; row<arr.length; row++) {
    		for(int col=0; col<arr[row].length; col++) {
    			if(row == col) {
    				digSum += arr[row][col];
    			}
    			if(row+col == (arr.length - 1)) {
    				revDigSum += arr[row][col];
    			}
    		}
    	}
    	
    	System.out.println("Diagonal Sum: "+ digSum);
    	System.out.println("Revese Diagonal Sum: "+revDigSum);
    	
    	return Math.abs(digSum-revDigSum);
    }


    public static void main(String[] args) throws IOException {

        int[][] arr = {{11,2,4}, {4,5,6}, {10,8,-12}};

        int result = diagonalDifference(arr);
        
        System.out.println("Result :::: "+result);

    }
}
