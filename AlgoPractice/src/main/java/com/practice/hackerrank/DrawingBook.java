package com.practice.hackerrank;

public class DrawingBook {
	
	/*
     * Complete the pageCount function below.
     */
    static int pageCount(int noOfPages, int pageNumber) {
    	int count = 0;
    	int pageFlips = 0;
    	int pageCount = noOfPages %2 == 0 ? noOfPages+1 : noOfPages;
    	for(int i=0,j=pageCount; i<pageCount/2; i++, j--) {
    		if(i == pageNumber || j == pageNumber)
    			break;
    		count++;
    	}
    	
    	pageFlips = count/2;
    	return pageFlips;
    }
	
	public static void main(String[] args) {
		System.out.println(pageCount(8, 7));
	}

}
