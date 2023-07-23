package com.practice.collections;

class Node<E> {
	E item;
	Node<E> next;
	
	Node(E element) {
		this.item = element;
		this.next = null;
	}
}

public class CustomLinkedList {
	
	Node<?> head;

	public void add(Object object) {
		Node<?> new_node = new Node(object);
		if(head == null) {
			head = new Node(object);
		} else {
			Node last = head.next;
			while(last.next != null) {
				last = last.next;
			}
			last.next = new_node;
		}
	}
	
	public int size() {
		
		int noOfElements = 0;
		if(head == null)
			return noOfElements;
		
		while(head.next != null) {
			head = head.next;
			noOfElements++;
		}
		return noOfElements;
	}
	
	public static void main(String[] args) {
		CustomLinkedList list = new CustomLinkedList();
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list.size()+" elements added successfully...");
		
	}
}
