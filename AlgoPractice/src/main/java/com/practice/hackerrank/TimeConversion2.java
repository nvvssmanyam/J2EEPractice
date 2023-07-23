package com.practice.hackerrank;

public class TimeConversion2 {

	static String timeConversion(String s) {

		boolean isAM = s.endsWith("AM");
		String arr[] = s.split(":");
		
		int hours = Integer.valueOf(arr[0]);
		if (!isAM) {
			s = s.replaceFirst(arr[0], String.valueOf( hours == 12 ? 12 : (hours+12)));
		} else {
			s = s.replaceFirst(arr[0], String.valueOf( hours == 12 ? "00" : String.format("%02d", hours)));
		} 
		return s.substring(0, s.length()-2);

	}


	public static void main(String[] args) {
		System.out.println(timeConversion("06:40:03AM"));
	}

}