package com.in28minutes.jpa.hibernate.AdvancedJPA.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class EmployeeAspect {

	@Before("execution(public String getName())")
	public void getNameAdvice() {
		System.out.println("Execution Advice on getName()");
	}
	
	
}
