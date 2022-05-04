package com.practice.collections;

public class CustomeLinkedList2<E> {

	Node<E> head = null;
	Node<E> tail = null;
	
	public void add(E item) {
		
		Node<E> nd = new Node(item);
		
		if(head == null) {
			head = nd;
			tail = nd;
		} else {
			tail.next = nd;
			tail = nd;
		}
		System.out.println("Element added..");
	}
	
	public int size() {
		int count = 0;
		Node<E> nd = head;
		
		while(nd != null) {
			count++;
			nd = nd.next;
		}
		
		return count;
	}
	
	public void remove(E item) throws Exception {
		if(head == null) {
			throw new Exception("List is empty");
		}
		
		
	}
	
	public static void main(String[] args) throws Exception {
		CustomeLinkedList2<Integer> list = new CustomeLinkedList2<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		System.out.println("Size of list ::: "+list.size());
		
		list.remove(10);
	}
}


