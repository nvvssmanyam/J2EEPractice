package com.practice.hackerrank;

public class PlusMinusRation {

	// Complete the plusMinus function below.
	static void plusMinus(int[] arr) {

		float neg = 0, pos = 0, nutral = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0)
				nutral++;
			else if (arr[i] < 0)
				neg++;
			else
				pos++;
		}
		System.out.println(String.format("%.6f", pos/arr.length));
		System.out.println(String.format("%.6f", neg/arr.length));
		System.out.println(String.format("%.6f", nutral/arr.length));

	}

	public static void main(String[] args) {

		int[] arr = { -4, 3, -9, 0, 4, 1 };

		plusMinus(arr);

	}
}