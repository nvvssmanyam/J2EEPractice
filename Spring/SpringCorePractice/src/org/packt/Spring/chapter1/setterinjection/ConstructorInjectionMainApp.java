package org.packt.Spring.chapter1.setterinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorInjectionMainApp {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		EmployeeService employee = context.getBean("empServiceWithConstructor", EmployeeService.class);
		EmployeeService employee1 = context.getBean("empServiceWithConstructor", EmployeeService.class);
		
		
		System.out.println("Is Employee singleton :: "+(employee==employee1));
		System.out.println(employee.getEmployee("2105"));
	}

}
