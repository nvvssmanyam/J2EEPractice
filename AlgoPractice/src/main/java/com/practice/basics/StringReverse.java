package com.practice.basics;

public class StringReverse {
	
	public static void main(String[] args) {
		String s = "Subrahmanyam";
		
		System.out.println(reverseString(s));
	}

	private static char[] reverseString(String s) {
		
		char[] charArr = new char[s.length()];
		char frontChar, backChar;
		for(int i=0; i<s.length()/2; i++) {
			frontChar = s.charAt(i);
			backChar = s.charAt((s.length()-1) - i);
			
			charArr[i] = backChar;
			charArr[(s.length()-1)-i] = frontChar;
		}
		return charArr;
	}

}
