package com.practice.iostreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}

public class SerilizeDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Person p1 = new Person("Subbu", 29);

		FileOutputStream fos = new FileOutputStream(new File("person.ser"));
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(p1);
		oos.close();
		fos.close();
		
		FileInputStream fis = new FileInputStream("person.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Person p = (Person) ois.readObject();
		System.out.println(p);
		
		ois.close();
		fis.close();
	}

}
