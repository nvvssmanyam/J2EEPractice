package com.ioc1.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.ioc1.beans.WishGenerator;

public class WishGeneratorApp {

	public static void main(String[] args) {
		
//		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("beans.xml"));	
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		WishGenerator wg = (WishGenerator) context.getBean("wg");
		System.out.println(wg.generateWishMsg());
		
	}
	
}
