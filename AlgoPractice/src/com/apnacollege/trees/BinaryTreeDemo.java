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
        static int buildTree(int[] nodes) {
            index++;
            if(nodes[index] == -1){
                return null;
            }
            Node root = new Node(nodes[index]);
            root.left = new Node(buildTree(nodes));
            root.right = new Node(buildTree(nodes));
        }

    }

    public static void main(String args[]){
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        System.out.println(BinaryTree.buildTree(nodes));
    }

}