package com.practice.hackerrank;

import java.util.Arrays;
import java.util.List;

public class MaxOutfits {

	public static void main(String[] args) {
		List<Integer> outfits = Arrays.asList(new Integer[]{2,2,5});
		System.out.println(getMaximumOutfits(outfits, 5));

	}

	public static int getMaximumOutfits(List<Integer> outfits, int money) {
		// Write your code here
		int maxOutfits = 0;
		int tempOutfits = 0;
		int remaingAmount = money;
		for (int i = 0; i < outfits.size(); i++) {
			if (money < outfits.get(i)) {
				maxOutfits = tempOutfits > maxOutfits ? tempOutfits : maxOutfits;
				tempOutfits = 0;
				continue;
			} else if(money >= outfits.get(i)) {
				if(remaingAmount >= outfits.get(i)) {
					tempOutfits++;
					remaingAmount = remaingAmount - outfits.get(i);
				}
				if(remaingAmount == 0) {
					maxOutfits = tempOutfits > maxOutfits ? tempOutfits : maxOutfits;
					tempOutfits = 0;
					remaingAmount = money;
				}
			}
		}
		return maxOutfits;
	}

}
