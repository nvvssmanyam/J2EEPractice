package com.practice.collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class BlockingQueue<E> {

	private Queue<E> bQueue = new LinkedList<>();
	private int maxQueueSize;

	public BlockingQueue(int maxQueueSize) {
		this.maxQueueSize = maxQueueSize;
	}

	public synchronized void enQueue(E element) throws InterruptedException {

		while (bQueue.size() == maxQueueSize) {
			System.out.println("Queue is full... waiting for deQueue");
			wait();
		}
		bQueue.add(element);
		notifyAll();
	}

	public synchronized void deQueue() throws InterruptedException {
		while (bQueue.size() == 0) {
			System.out.println("Queue is empty... waiting for enQueue");
			wait();
		}
		bQueue.remove();
		notifyAll();
	}

	public static void main(String[] args) throws InterruptedException {
		BlockingQueue<Integer> queue = new BlockingQueue<>(10);
		System.out.println("Process started");
		for (int i = 0; i < 100; i++) {
			queue.enQueue(i);
		}
		System.out.println("Process ended");
	}

}
