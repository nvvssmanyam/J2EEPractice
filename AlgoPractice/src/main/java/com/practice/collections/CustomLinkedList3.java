package com.practice.collections;

class MyNode<E> {
	E element;
	MyNode<E> next;
	
	public MyNode(E element) {
		this.element = element;
		this.next = null;
	}

	@Override
	public String toString() {
		return "MyNode [element=" + element + ", next=" + next + "]";
	}
	
}

public class CustomLinkedList3<E> {
	
	MyNode<E> head;
	MyNode<E> tail;
	int size = 0;
	
	public CustomLinkedList3() {
		head = null;
		tail = null;
	}
	
	public void add(E element) {
		MyNode<E> node = new MyNode<>(element);
		if(head == null) {
			head = node;
			tail = node;
		} else {
			tail.next = node;
			tail = node;
		}
		size++;
	}
	
	public int size() {
		return size;
	}
	
	public void remove(E element) {
		if(size > 0) {
			MyNode<E> node = head;
			MyNode<E> prev = null;
			for(int index=0; index<size; index++) {
				if(node.element.equals(element)) {
					prev.next = node.next;
					size--;
					return;
				}
				prev = node;
				node = node.next;
			}
			System.out.println("Elemnet not found");
		}
	}
	
	@Override
    public String toString() {
		
        if (size == 0)
            return "[]";

        StringBuilder sb = new StringBuilder();
        MyNode<E> node = head;
        sb.append('[');
        for (int index =0; index < size; index++) {
            sb.append(node.element);
            if (node.next == null)
                return sb.append(']').toString();
            sb.append(',').append(' ');
            node = node.next;
        }
        return sb.toString();
    }
	
	public static void main(String[] args) {
		CustomLinkedList3<Integer> list = new CustomLinkedList3<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		list.remove(20);
		System.out.println("Size of list is :: "+list.size());
		System.out.println(list.toString());
	}

}
