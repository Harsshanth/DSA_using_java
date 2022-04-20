package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    Node root;

    LinkedList<Node> queue = new LinkedList<Node>();

    public class Node {
        Node right,left;
        int value;
        Node (int value) {
            this.value = value;
            this.right = null;
            this.left = null;
        }
    }

    public void insert(int value) {
        Node node = new Node(value);
        if(queue.isEmpty()) {
            root = node;
            queue.add(root);
            return ;
        }
        Node temp = queue.peek();
        if(temp.right != null && temp.left != null) {
            queue.remove(0);
            temp = queue.peek();
        }
        if(temp.left == null) {
            temp.left = node;
            queue.add(temp.left);
        }else if(temp.right == null){
            temp.right = node;
            queue.add(temp.right);
        }
    }

    public void inorderDisplayMap () {
        inorderDisplay(root);
    }

    private void inorderDisplay(Node temp) {
        if(temp != null){
            inorderDisplay(temp.left);
            System.out.print(temp.value + " --> ");
            inorderDisplay(temp.right);
        }
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.insert(6);
        bt.insert(3);
        bt.insert(8);
        bt.insert(0);
        bt.insert(7);
        bt.insert(10);
        bt.inorderDisplayMap();
    }
}
