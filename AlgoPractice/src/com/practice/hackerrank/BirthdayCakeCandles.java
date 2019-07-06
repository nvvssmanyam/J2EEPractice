package com.practice.hackerrank;

import java.util.Arrays;
import java.util.List;

public class BirthdayCakeCandles {

	static int birthday(List<Integer> s, int d, int m) {
		int possibleSquares = 0;

		if (m == s.size()) {
			possibleSquares = d == getSumOfSublist(s) ? 1 : 0;
		} else {
			for (int i = 0; i <= s.size() - m; i++) {
				possibleSquares = d == getSumOfSublist(s.subList(i, i + m)) ? possibleSquares + 1 : possibleSquares;
			}
		}

		return possibleSquares;
	}

	static int getSumOfSublist(List<Integer> subList) {

		int sum = 0;
		for (Integer integer : subList) {
			sum += integer;
		}
		return sum;

	}

	public static void main(String[] args) {

		Integer[] arr = {2, 5, 1, 3, 4, 4, 3, 5, 1, 1, 2, 1, 4, 1, 3, 3, 4, 2, 1};
		
		List<Integer> list = Arrays.asList(arr);
		
		System.out.println(birthday(list, 18, 7));

	}
}