package com.practice.challenges.recursion;

public class ReverseString {

	public static void main(String[] args) {
		String str = "abcdef";
		System.out.println(reverseStr(str));
	}

	private static String reverseStr(String str) {
		if(str.isEmpty()) {
			return str;
		} else {
			return reverseStr(str.substring(1)) + str.charAt(0);
		}
		
	}

}
