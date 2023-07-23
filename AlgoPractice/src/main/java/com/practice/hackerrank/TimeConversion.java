package com.practice.hackerrank;

public class TimeConversion {

	static String timeConversion(String s) {

		boolean isAM = s.endsWith("AM");
		String arr[] = s.split(":");
		int hour = Integer.valueOf(arr[0]);
		int min = Integer.valueOf(arr[1]);
		int sec = Integer.valueOf(arr[2].substring(0, arr[2].indexOf(isAM ? "AM" : "PM")));
		if (isAM && hour == 12) {
			hour = 0;
		}
		if (!isAM) {
			hour = hour == 12 ? 12 : hour + 12;
		}
		return makeFormar(hour) + ":" + makeFormar(min) + ":" + makeFormar(sec);

	}

	static String makeFormar(int val) {
		return String.format("%02d", val);
	}

	public static void main(String[] args) {
		System.out.println(timeConversion("12:05:45PM"));
	}

}
