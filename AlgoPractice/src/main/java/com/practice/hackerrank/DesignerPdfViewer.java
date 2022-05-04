package com.practice.hackerrank;

import java.util.HashMap;
import java.util.Map;

public class DesignerPdfViewer {

	// Complete the designerPdfViewer function below.
    static int designerPdfViewer(int[] arr, String word) {
    	int area = 0;
    	
    	Map<Character, Integer> map = new HashMap<>();
    	for(int i=0; i<arr.length; i++) {
    		char c = (char)(97+i);
    		map.put(c, arr[i]);
    	}
    	
    	int maxCharHeight = 0;
    	for(int i=0; i<word.length(); i++) {
    		char c = word.charAt(i);
    		
    		if(map.get(c) > maxCharHeight) {
    			maxCharHeight = map.get(c);
    		}
    	}
    	
    	area = maxCharHeight * word.length();
    	
    	return area;
    }
	
	public static void main(String[] args) {
		int arr[] = {1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7};
		System.out.println(designerPdfViewer(arr, "zaba"));
	}

}
