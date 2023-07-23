package com.in28minutes.In28Minutes.beans;

import org.springframework.stereotype.Component;

@Component
public class BubbleSortAlgorithm implements SortAlgorithm{

	@Override
	public int[] sort(int[] numbers) {
		System.out.println("In Bubblesort");
		return numbers;
	}

}
