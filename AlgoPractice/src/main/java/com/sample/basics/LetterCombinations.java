package com.sample.basics;

public class LetterCombinations {
	
	public static void main(String[] args) {
		
		String s = "123456";
		int pos = 0;
		char[] carr = s.toCharArray();
		
		int doubleChar = 0;
		
		for(int i=0; i<(carr.length-1); i++) {
			doubleChar = carr[i]+carr[i+1];
			if(doubleChar > 27) {
				pos++;
			}
		}
		
	}

}
