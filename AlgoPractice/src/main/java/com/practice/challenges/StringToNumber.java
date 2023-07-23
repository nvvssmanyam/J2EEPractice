package com.practice.challenges;

public class StringToNumber {

	public static void main(String[] args) {
		String str = "1234098";
		printAsNumber(str);
	}

	private static void printAsNumber(String str) {
		char[] carr = str.toCharArray();
		for(int i=0;i<carr.length;i++) {
			System.out.println((int)carr[i] - (int)'0');
		}
	}

}
