package com.algo.sorting;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BubbleSortDemoTest {

	int[] arr;
	
	public BubbleSortDemoTest() {
		arr = new int[] {25, 10, 15, 5, 1};
	}
	
	@Before
	public void beforeTest() {
		System.out.println("In before test");
	}
	
	@Test
	public void doSortWithNullTest() {
		Assert.assertArrayEquals(BubbleSortDemo.doSort(arr), new int[] {1, 5, 10, 15, 25});
	}
	
	@After
	public void afterTest() {
		System.out.println("In after test");
	}
	
}
