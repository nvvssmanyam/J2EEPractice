package com.in28minutes.jpa.hibernate.AdvancedJPA.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Passport {

	@Id
	@GeneratedValue
	private long id;
	private String number;

	public Passport() {
		super();
	}

	public Passport(String number) {
		super();
		this.number = number;
	}

	public long getId() {
		return id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Passport [id=" + id + ", number=" + number + "]";
	}
	
}
