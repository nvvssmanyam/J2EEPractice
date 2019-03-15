package com.basic.containers.beans;

public class Address {
	
	private String city;
	private String zipcode;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public Address(String city, String zipcode) {
		super();
		this.city = city;
		this.zipcode = zipcode;
		System.out.println("Address Bean has called");
	}
	
	@Override
	public String toString() {
		return "Address [city=" + city + ", zipcode=" + zipcode + "]";
	}

}
