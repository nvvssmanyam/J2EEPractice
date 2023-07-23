package com.practice.basics;

enum WeekDays {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THRUSDAY, FRIDAY, SATURDAY
}

public class EnumsDemo {
	public static void main(String[] args) {
		WeekDays wk;
		// wk can be assigned only the constants defined under enum type Weekdays
		wk = WeekDays.FRIDAY;
		
		WeekDays day = WeekDays.valueOf("SUNDAY");
		System.out.println(day);
		
		System.out.println("Today is : "+wk);
		System.out.println(WeekDays.values());
	}
}
