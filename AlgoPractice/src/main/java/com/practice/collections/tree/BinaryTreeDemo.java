package com.practice.collections.tree;

public class BinaryTreeDemo {
	
	public class Node<T> {
		
		T data;
		Node<T> rightNode;
		Node<T> leftNode;
		
		public T getData() {
			return data;
		}
		public void setData(T data) {
			this.data = data;
		}
		public Node<T> getRightNode() {
			return rightNode;
		}
		public void setRightNode(Node<T> rightNode) {
			this.rightNode = rightNode;
		}
		public Node<T> getLeftNode() {
			return leftNode;
		}
		public void setLeftNode(Node<T> leftNode) {
			this.leftNode = leftNode;
		}
		
		
	}

	public static void main(String[] args) {
		
		BinaryTreeDemo bTree = new BinaryTreeDemo(); 
		
	}

}
