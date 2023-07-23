package com.in28minutes.In28Minutes.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("selectionsort")
public class SelectionSortAlgorithm implements SortAlgorithm{

	@Override
	public int[] sort(int[] numbers) {
		System.out.println("In Selectionsort");
		return numbers;
	}

}
