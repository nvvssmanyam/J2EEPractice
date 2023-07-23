package com.practice.classloaders;

import java.util.ArrayList;


/*
 *  Describe class loaders in JVM
 *  Source: https://www.baeldung.com/java-classloaders
 */
public class ClassLoadersDemo {
	
	public static void printClassLoaders() {
		/*
		 *  Application class loader
		 */
		System.out.println("Class loader of the class: "+ClassLoadersDemo.class.getClassLoader());
		
		/*
		 *  Extention class loader (3rd party jars logging etc..,)
		 */
		// System.out.println("Classloader of Logging:"+ Logging.class.getClassLoader());
		
		/*
		 *  Bootstrap class loaders (rt.jar.., displayed as null) 
		 */
		System.out.println("Class loader of ArrayList: "+ArrayList.class.getClassLoader());
	}
	
	public static void main(String[] args) {
		printClassLoaders();
	}

}
