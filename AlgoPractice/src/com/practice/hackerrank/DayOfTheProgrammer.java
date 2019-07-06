package com.practice.hackerrank;

public class DayOfTheProgrammer {
	
	// Complete the dayOfProgrammer function below.
    static String dayOfProgrammer(int year) {

    	if(year>=1919) {
    		if((year%400 == 0) || (year%4==0 && year%100 != 0)) {
    			return "12.09."+year;
    		} else 
    			return "13.09."+year;
    	} else if(year < 1918) {
    		if(year %4 ==0 ) {
    			return "12.09."+year;
    		} else 
    			return "13.09."+year;
    	} else {
    		return "26.09."+year;
    	}
    }
	
	
	public static void main(String[] args) {
		System.out.println(dayOfProgrammer(1918));
	}

}
