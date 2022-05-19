package com.company;

public class FindTheLeadNode {
    Node root ;
    FindTheLeadNode() {
        root = null;
    }
    class Node {
        int item;
        Node left,right;
        Node(int item) {
            this.item = item;
            left = right = null;
        }
    }

    public void insertMap(int item) {
       root =  insert(item, root);
    }

    public Node insert(int item , Node root) {
        Node node = new Node(item);
        if(root == null) {
            root = node;
            return root;
        }
        if(root.item > item) {
            root.left = insert(item, root.left);

        }else {
            root.right = insert(item, root.right);
        }
        return root;
    }
    public void displayMap(){
        display(root);
    }
    public void display(Node root) {
        if(root != null) {
            display(root.left);
            System.out.print(root.item + "-->");
            display(root.right);
        }
    }
    public int countLeafNode() {
        return countLeafNode(root);
    }
    public int countLeafNode(Node root) {
        if(root == null) return 0;
        else if(root.left == null && root.right == null) return 1;
        return countLeafNode(root.left) + countLeafNode(root.right);
    }

    public static void main(String[] args) {
        FindTheLeadNode tree = new FindTheLeadNode();
        tree.insertMap(4);
        tree.insertMap(1);
        tree.insertMap(8);
        tree.insertMap(9);
        tree.insertMap(2);
        tree.displayMap();
        System.out.println(tree.countLeafNode());
    }
}
