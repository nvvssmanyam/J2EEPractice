package com.practice.hackerrank;

public class UtopianTree {

	static int utopianTree(int n) {
		int height = 1;

		for(int i=1; i<=n; i++) {
			if(i%2 != 0)
				height = height*2;
			else 
				height++;
		}
		
		return height;
	}

	public static void main(String[] args) {
		System.out.println(utopianTree(1));
	}
}
