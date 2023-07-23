package com.practice.basics;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Demo implements Cloneable, Serializable {

	private static final long serialVersionUID = 1L;
	public int dataMem;

	public void m1() {
		System.out.println("In method m1 and dataMem value is : " + dataMem);
	}

	@Override
	public String toString() {
		return "Demo [dataMem=" + dataMem + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class ObjectCreationDemo {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException,
			ClassNotFoundException, IOException, CloneNotSupportedException {

		// Regular way
		Demo d1 = new Demo();
		d1.dataMem = 10;
		System.out.println("Regular way object");
		System.out.println(d1);

		// With class.forName
		Class c = Class.forName("Demo");
		Demo d2 = (Demo) c.newInstance();
		// Demo d = Demo.class.newInstance();
		System.out.println("With class.forName");
		System.out.println(d2);

		// Cloning object
		Demo d3 = (Demo) d1.clone();
		System.out.println("Clonned object");
		System.out.println(d3);

		ObjectOutputStream oos;
		oos = new ObjectOutputStream(new FileOutputStream("demo.ser"));
		oos.writeObject(d1);
		oos.close();

		// De-serialization
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("demo.ser"));
		Demo d4 = (Demo) in.readObject();
		in.close();
		System.out.println("Deserilized object");
		System.out.println(d4);

	}

}
