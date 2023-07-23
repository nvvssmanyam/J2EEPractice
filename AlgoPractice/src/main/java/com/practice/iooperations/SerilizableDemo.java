package com.practice.iooperations;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerilizableDemo {
	
	public static void main(String[] args) {
		
		Student s1 = new Student(1, "Raja");
		
		try(FileOutputStream fos = new FileOutputStream(new File("sample.txt")); ObjectOutputStream oos = new ObjectOutputStream(fos);) {			
			oos.writeObject(s1);
			System.out.println("Student object serilized successfully...");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
