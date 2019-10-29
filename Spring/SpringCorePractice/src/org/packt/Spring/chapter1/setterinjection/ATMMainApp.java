package org.packt.Spring.chapter1.setterinjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class ATMMainApp {
	
	public static void main(String[] args) {
		BeanFactory context = new XmlBeanFactory(new ClassPathResource("beans.xml"));
		ATM atm = context.getBean("atm", ATM.class);
		ATM atm2 = context.getBean("atm", ATM.class);
		System.out.println(atm.getPrinter());
		System.out.println(atm2.getPrinter());
		atm.printBalance("1234");
	}

}
