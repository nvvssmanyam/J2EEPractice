package com.practice.hackerrank;

public class TheHurdleRace {
	
    // Complete the hurdleRace function below.
    static int hurdleRace(int initialCapacity, int[] heights) {
    	int maxHeight = 0;
    	for(int i=0; i<heights.length; i++) {
    		maxHeight = heights[i] > maxHeight ? heights[i] : maxHeight;
    	}
    	return maxHeight > initialCapacity ? maxHeight - initialCapacity : 0;
    }

	
	public static void main(String[] args) {
		int arr[] = {1, 6, 3, 5, 2};
		System.out.println(hurdleRace(4, arr));
	}

}
