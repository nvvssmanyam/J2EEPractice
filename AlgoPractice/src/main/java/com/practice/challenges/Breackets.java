package com.practice.challenges;

import java.util.Stack;

public class Breackets {

	public static void main(String[] args) {

		String s = "{abc}(def[gh])";
		if(isProperlyAligned(s)) {
			System.out.println("Properly aligned...");
		} else {
			System.out.println("Not aligned properly ...");
		}

	}

	private static boolean isProperlyAligned(String s) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[') {
				stack.push(s.charAt(i));
				System.out.println("Stack :: "+stack);
			} else if (s.charAt(i) == '}') {
				if (stack.peek() == '{') {
					stack.pop();
				} else {
					return false;
				}
			} else if (s.charAt(i) == ')') {
				if (stack.peek() == '(') {
					stack.pop();
				} else {
					return false;
				}
			} else if (s.charAt(i) == ']') {
				if (stack.peek() == '[') {
					stack.pop();
				} else {
					return false;
				}
			}
		}
		if(stack.size() == 0) {
			return true;
		}

		return false;
	}

}
