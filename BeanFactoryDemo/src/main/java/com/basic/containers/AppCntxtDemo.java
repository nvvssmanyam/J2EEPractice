package com.basic.containers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.basic.containers.beans.Employee;


/*
 *  ApplicationContext
 *  **************************************************************************************************************************
 *  ApplicationContext is a subinterface of BeanFactory. It adds easier integration with Spring’s AOP features 
 *  message resource handling (for use in internationalization), event publication; and application-layer specific contexts 
 *  such as the WebApplicationContext for use in web applications.
 *  
 *  Main diff b/w Application context and Bean factory is Eager loading in application context and Lazy loading in BeanFacotry 
 *  **************************************************************************************************************************
 */
public class AppCntxtDemo {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Employee emp = (Employee) context.getBean("employee");
		System.out.println(emp);
	}
	
}
