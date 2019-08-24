package org.packt.Spring.chapter1.setterinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjectionMainApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		EmployeeService emp = (EmployeeService) context.getBean("empServiceWithSetter");
		
		System.out.println(emp.getEmployee("1605"));
	}
	
}
