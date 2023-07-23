package com.practice.threads;

import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DeplyedQueueExample {

	public static void main(String[] args) throws InterruptedException {

		DelayQueue<Employee> dq = new DelayQueue<>();

		new Thread(new Runn(dq)).start();
		System.out.println(dq);
		Employee em;
	
		while ((em=dq.take())!=null ) {
			System.out.println("DQ is not empty");
			System.out.println("Expired at :"+System.currentTimeMillis());
			System.out.println(em);
			System.out.println(dq);
			
		}

	}

}

class Employee implements Delayed {

	Long creationtime;
	String name;

	public Employee(long creationtime, String name) {
		super();
		this.creationtime = creationtime;
		this.name = name;
		System.out.println("Created time :"+System.currentTimeMillis());
	}

	@Override
	public long getDelay(TimeUnit unit) {
		return unit.convert(creationtime - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
	}

	@Override
	public int compareTo(Delayed o) {

		return this.getCreationtime().compareTo(((Employee) o).getCreationtime());
	}

	public Long getCreationtime() {
		return creationtime;
	}

	public void setCreationtime(Long creationtime) {
		this.creationtime = creationtime;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [creationtime=" + creationtime + ", name=" + name + "]";
	}

}

class Runn implements Runnable {
	DelayQueue<Employee> dq;

	public Runn(DelayQueue<Employee> dq) {
		this.dq = dq;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		dq.put(new Employee(5000, "VVS"));
		try {
			Thread.sleep(3000);

			System.out.println("444444444444444444444444");
			dq.put(new Employee(5000, "VVN"));
			Thread.sleep(3000);
			System.out.println("444444444444444444444444");
			dq.put(new Employee(5000, "KAS"));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("444444444444444444444444");

	}
}