package org.packt.Spring.chapter2.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireMainApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("autowiredBeans.xml");
//		EmployeeService empService = context.getBean("empService", EmployeeService.class);
		EmployeeService empServiceByAutowire = context.getBean("empServiceByConstructor", EmployeeService.class);
		
//		System.out.println(empService.getEmployee("2124"));
		System.out.println(empServiceByAutowire.getEmployee("2125"));
	}
	
}
