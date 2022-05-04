package com.algo.sorting;

import java.util.HashSet;
import java.util.Set;

class A {
	static void run1() {
		System.out.println("A:: run");
	}
	
	public void run() {
		System.out.println("B:: run");
	}
}

class B extends A {
	public void run() {
		System.out.println("B:: run");
	}
	
	private static final void m1() {
		
	}
}

public class PersonComparatorDemo {
	
	public static void main(String[] args) {
		
		B b = new B();
		B.run1();
		
		Person p1 = new Person(1, "Subbu");
		Person p2 = new Person(1, "Subbu");
		
		Set<Person> set = new HashSet<>();
		
		set.add(p1);
		set.add(p2);
		
		System.out.println(set.size());
		
	}

}
