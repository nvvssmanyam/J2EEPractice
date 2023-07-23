package com.sample.basics;

class Sample implements Cloneable {
	int num1;
	String str1;
	
	public Sample(int num1, String str1) {
		this.num1 = num1;
		this.str1 = str1;
	}

	@Override
	public String toString() {
		return "Sample [num1=" + num1 + ", str1=" + str1 + "]";
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return this;
	}

}

public class CloneDemo {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Sample s1 = new Sample(10, "AAA");
		Sample s2 = new Sample(20, "BBB");
		
		Sample s3 = (Sample) s1.clone();
		System.out.println(s3);
		
	}
}
