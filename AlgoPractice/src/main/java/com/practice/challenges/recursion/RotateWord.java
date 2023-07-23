package com.practice.challenges.recursion;

import java.util.Arrays;

public class RotateWord {

	public static void main(String[] args) {
		String str = "Catch the bus";
		
		String[] words = str.split(" ");
		for(int i = 0; i<words.length; i++) {
			words[i] = rotateWord(words[i]);
		}
		
		System.out.println(Arrays.toString(words));
		
	}

	private static String rotateWord(String word) {
		if(word.isEmpty()) {
			return word;
		}
		return rotateWord(word.substring(1))+ word.charAt(0);
	}

}
