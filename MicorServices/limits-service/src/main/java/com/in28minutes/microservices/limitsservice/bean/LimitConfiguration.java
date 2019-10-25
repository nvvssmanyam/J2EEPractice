package com.in28minutes.microservices.limitsservice.bean;

public class LimitConfiguration {
	
	private int maxLimit;
	private int minLimit;
	
	public LimitConfiguration() {

	}

	public LimitConfiguration(int maxLimit, int minLimit) {
		this.maxLimit = maxLimit;
		this.minLimit = minLimit;
	}

	public int getMaxLimit() {
		return maxLimit;
	}

	public int getMinLimit() {
		return minLimit;
	}
	
}
