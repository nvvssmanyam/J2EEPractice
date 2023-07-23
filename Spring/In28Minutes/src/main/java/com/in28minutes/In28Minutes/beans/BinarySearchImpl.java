package com.in28minutes.In28Minutes.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {
	
	@Autowired
	private SortAlgorithm selectionSortAlgorithm ;
	
	public int binarySearch(int[] numbers, int numberToSearch) {
		int[] sortedNumbers = selectionSortAlgorithm.sort(numbers);
		System.out.println(selectionSortAlgorithm);
		return 3;
	}
	
}
