package com.practice.threads.syncronized;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

class Producer1 implements Runnable {

	Queue<Integer> queue;
	int maxLimit;

	public Producer1(Queue<Integer> queue, int maxLimit) {
		this.queue = queue;
		this.maxLimit = maxLimit;
	}

	public void run() {
		while (true) {
			synchronized (queue) {
				try {
					if (maxLimit == queue.size()) {
						System.out.println("Queue is full, waiting for dequeue...");
						queue.wait();
					}
					queue.add(new Random().nextInt());
					System.out.println("In Produce :: " + queue.size());
					queue.notifyAll();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

}

class Consumer1 implements Runnable {

	Queue<Integer> queue;
	int maxLimit;

	public Consumer1(Queue<Integer> queue, int maxLimit) {
		this.queue = queue;
		this.maxLimit = maxLimit;
	}

	public void run() {
		while (true) {
			synchronized (queue) {
				try {
				if (queue.isEmpty()) {
					System.out.println("Queue is empty, waiting for enqueue...");
					queue.wait();
				}
				queue.poll();
				System.out.println("In Consumer :: " + queue.size());
				queue.notifyAll();
			} catch (Exception e) {
				e.printStackTrace();
			}
			}
		}
	}
}

public class ProducerConsumerDemo2 {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		Thread t1 = new Thread(new Producer1(queue, 10));

		Thread t2 = new Thread(new Consumer1(queue, 10));

		t1.start();
		t2.start();

	}
}
