package com.apnacollege.trees;

public class BinaryTreeDemo {

    static class Node {
        Node right;
        Node left;
        int data;

        public Node(int data){
            this.right = null;
            this.left = null;
            this.data = data;
        }
    }

    static class BinaryTree {
        static int index = -1;
        static Node buildTree(int[] nodes) {
            index++;
            int data = nodes[index];
            if(data == -1){
                return null;
            }
            Node root = new Node(data);
            root.left = buildTree(nodes);
            root.right = buildTree(nodes);
            return root;
        }

    }

    public static void main(String args[]){
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        System.out.println(BinaryTree.buildTree(nodes));
    }

}