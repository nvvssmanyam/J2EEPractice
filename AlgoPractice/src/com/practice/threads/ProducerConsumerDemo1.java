package com.practice.threads;

import java.util.ArrayList;
import java.util.List;

class Producer extends Thread {
	List<Integer> list;
	public Producer(List<Integer> list) {
		this.list = list;
	}
	
	public void run() {
		synchronized (list) {
			while(true) {
				if(list.size()==0) {
					produce();
				} else {
					try {
						list.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

	private void produce() {
		for(int i=1; i<=5;i++) {
			list.add(i);
			System.out.println("Produced element "+i);
		}
		list.notifyAll();
	}
}

class Consumer extends Thread {
	List<Integer> list;
	public Consumer(List<Integer> list) {
		this.list = list;
	}
	
	public void run() {
		synchronized (list) {
			while(true) {
				if(list.size() !=0) {
					consumeItem();
				} else {
					try {
						list.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

	private void consumeItem() {
		for(int i=0;i<5;i++) {
			System.out.println("Consumed item "+list.get(i));
			list.remove(i);
		}
		list.notifyAll();
	}
	
}

public class ProducerConsumerDemo1 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		Thread t1 = new Producer(list);
		Thread t2 = new Consumer(list);
		
		t1.start();
		t2.start();
		
	}
	
}
