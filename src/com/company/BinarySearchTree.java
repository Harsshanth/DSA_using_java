package com.company;

public class BinarySearchTree  {
    private Node root;
    BinarySearchTree () {
        root = null;
    }
    class Node {
        int value;
        Node left,right;
        Node (int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }
    public void insertmap(int value) {
        root = insert(value , root);
    }
    public Node insert (int value, Node root) {

        if(root == null){
            root = new Node(value);
            return  root;
        }
        if(root.value > value) {
            root.left = insert(value, root.left);
        }
        else
            root.right = insert(value,root.right);

        return root;
    }

    public void inorderDisplayMap () {
        inorderDisplay(root);
    }

    public void inorderDisplay(Node temp) {
        if(temp != null){
            inorderDisplay(temp.left);
            System.out.print(temp.value + " --> ");
            inorderDisplay(temp.right);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insertmap(3);
        tree.insertmap(4);
        tree.insertmap(1);
        tree.insertmap(3);
        tree.insertmap(8);
        tree.inorderDisplayMap();

    }

}
