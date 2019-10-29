package com.ioc1.beans;

import java.util.Date;

public class WishGenerator {

	private String name;
	private Date date;

	public void setName(String name) {
		this.name = name;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	public String generateWishMsg() {
		
		if(date.getHours() < 12) {
			return "Good morning : "+name;
		} else if (date.getHours() < 18) {
			return "Good afternoon : "+name;
		} else {
			return "Good night : "+name;
		}
	}
}
