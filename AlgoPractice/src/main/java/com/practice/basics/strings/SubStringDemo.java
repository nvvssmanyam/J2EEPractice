package com.practice.basics.strings;

public class SubStringDemo {

	public static void main(String[] args) {
		String str = "abcde";
		System.out.println(str);
		
		System.out.println("Is f exists in string :: "+ (str.indexOf("f") != -1));
		
		for(int i=0; i<3; i++) {
			str = oneMove(str);
		}
		System.out.println(str);
		
	}
	
	public static String oneMove(String str) {
		return str.substring(1)+str.charAt(0);
	}

}
