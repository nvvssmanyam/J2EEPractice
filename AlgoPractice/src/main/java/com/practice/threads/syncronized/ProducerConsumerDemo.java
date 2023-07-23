package com.practice.threads.syncronized;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/*
 *  Read more: https://javarevisited.blogspot.com/2015/07/how-to-use-wait-notify-and-notifyall-in.html#ixzz5zN09xKEF
*/
class Producer implements Runnable {

	Queue<Integer> queue;
	int max_size;

	public Producer(Queue<Integer> queue, int max_size) {
		this.queue = queue;
		this.max_size = max_size;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (queue) {
				while (queue.size() == max_size) {
					try {
						System.out.println("Queue is full, " + "Producer thread waiting for "
								+ "consumer to take something from queue");
						Thread.sleep(5000);
						queue.wait();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				queue.add(new Random().nextInt());
				System.out.println("In producer :: " + queue.size());
				queue.notifyAll();
			}
		}
	}
}

class Consumer implements Runnable {

	Queue<Integer> queue;
	int max_size;

	public Consumer(Queue<Integer> queue, int max_size) {
		this.queue = queue;
		this.max_size = max_size;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (queue) {
				while (queue.isEmpty()) {
					try {
						System.out.println("Queue is empty," + "Consumer thread is waiting"
								+ " for producer thread to put something in queue");
						Thread.sleep(5000);
						queue.wait();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				queue.remove();
				System.out.println("In consumer :: " + queue.size());
				queue.notifyAll();
			}
		}
	}
}

public class ProducerConsumerDemo {

	public static void main(String[] args) {

		Queue<Integer> queue = new LinkedList<>();
		int max_size = 10;

		Thread producerThread = new Thread(new Producer(queue, max_size));
		producerThread.start();

		Thread consumerThread = new Thread(new Consumer(queue, max_size));
		consumerThread.start();

	}

}
