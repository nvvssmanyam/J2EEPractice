package com.practice.iooperations;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerilizableDemo {

	public static void main(String[] args) {
		
		try (FileInputStream fis = new FileInputStream(new File("sample.txt")); ObjectInputStream ois = new ObjectInputStream(fis);) {
			Student s = (Student) ois.readObject();
			System.out.println(s);
		}catch(IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
