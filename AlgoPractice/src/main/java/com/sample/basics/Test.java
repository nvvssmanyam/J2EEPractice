package com.sample.basics;

public class Test {

	int val;
	
	public Test(int val) {
		this.val = val;
	}

	@Override
	public int hashCode() {
		return val;
	}
	
	public static void main(String[] args) {
		
		Test t1 = new Test(10);
		Test t2 = new Test(100);
		
		System.out.println(t1);
		System.out.println(t2);
		
	}
	
}
