package com.practice.hackerrank;

public class StairCase {

	static void printStairCase(int levels) {
		for (int row = 0; row < levels; row++) {
			for (int col = levels - 1; col >= 0; col--) {
				System.out.print(row < col ? " " : "#");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		printStairCase(5);
	}

}
