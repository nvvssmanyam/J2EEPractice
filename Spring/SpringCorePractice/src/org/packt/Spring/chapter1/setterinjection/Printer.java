package org.packt.Spring.chapter1.setterinjection;

public class Printer {
	private String message;

	public void setMessage(String message) {
		this.message = message;
	}

	public void printBalance(String accountNumber) {
		System.out.println(message + accountNumber);
	}
}