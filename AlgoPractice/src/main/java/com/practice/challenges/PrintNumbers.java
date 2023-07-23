package com.practice.challenges;

public class PrintNumbers {

	private static String[] singleDigitNumbersInText = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
	private static String[] doubleDigitNumbersInText = { "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fiveteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
	private static String[] tensInText = { "", "Ten", "Twenty", "Thirty", "Fourty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety", "Hundred"};

	public static void main(String[] args) {
		printNumbersInText(1);
	}

	private static void printNumbersInText(int num) {
		StringBuilder numberString = new StringBuilder();
		int length = 0;
		while (num > 0) {
			length++;
			if (length == 2 && num%10 != 0) {
				if (num == 1) 
					numberString = new StringBuilder(doubleDigitNumbersInText[num % 10]);
				else  
					numberString = new StringBuilder(tensInText[num % 10] + " "+ numberString);
			} else if (length == 3 && num%10 != 0 ) {
				numberString = new StringBuilder(singleDigitNumbersInText[num % 10] + "Hundred " + (null != numberString ? numberString : ""));
			} else if (length == 4) {
				numberString = new StringBuilder(singleDigitNumbersInText[num % 10] + "Thousend " + (null != numberString ? numberString : ""));
			} else if (num%10 != 0){
				numberString = new StringBuilder(singleDigitNumbersInText[num % 10] + numberString);
			}
			num = num / 10;
		}
		System.out.println(numberString);
	}

}
