package com.in28minutes.In28Minutes;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.in28minutes.In28Minutes.beans.BinarySearchImpl;

@SpringBootApplication
public class SpringBasicApplication {

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new AnnotationConfigApplicationContext(SpringBasicApplication.class);
		
		BinarySearchImpl binarySearch = context.getBean(BinarySearchImpl.class);
		BinarySearchImpl binarySearch1 = context.getBean(BinarySearchImpl.class);
		System.out.println(binarySearch);
		System.out.println(binarySearch1);
		
		int result = binarySearch.binarySearch(new int[] {12, 4, 3, 6},  3);
		System.out.println(result);

	}

}
