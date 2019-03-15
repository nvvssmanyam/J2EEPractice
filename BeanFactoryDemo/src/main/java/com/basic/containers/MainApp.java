package com.basic.containers;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.basic.containers.beans.Employee;


/*
 *  BeanFactory
 *  *****************************************************************************************************
 *  The BeanFactory is the actual container which instantiates, configures, and manages a number of beans. 
 *  These beans typically collaborate with one another, and thus have dependencies between themselves. 
 *  These dependencies are reflected in the configuration data used by the BeanFactory.
 *  It provides an advanced configuration mechanism capable of managing any type of object.
 *  *****************************************************************************************************
 *  
 *  ApplicationContext
 *  ***********************************************************************************************************************
 *  ApplicationContext is a subinterface of BeanFactory. It adds easier integration with Spring’s AOP features 
 *  message resource handling (for use in internationalization), event publication; and application-layer specific contexts 
 *  such as the WebApplicationContext for use in web applications.
 *  ***********************************************************************************************************************
 */
public class MainApp {
	
	public static void main(String[] args) {
		Resource res = new ClassPathResource("beans.xml");
		@SuppressWarnings("deprecation")
		XmlBeanFactory factory = new XmlBeanFactory(res);
		Employee obj = (Employee) factory.getBean("employee");
		System.out.println(obj);
	}

}
