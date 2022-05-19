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
    private Node insert (int value, Node root) {

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

    public boolean searchMap(int value){
        Node temp = null;
        temp = search(root,value);
        if(temp != null)
            return true;
        return false;
    }
    private Node search(Node root , int value){
        if(root == null || root.value == value)
            return root;
        if(root.value > value)
            return search(root.left , value);
        else
            return search(root.right , value);
    }

    public void deleteMap(int value) {
        delete(value,root);
    }

    private Node delete(int value,Node root){
        if(root == null)
            return root;
        if(root.value < value) {
            root.right = delete(value,root.right);
        } else if(root.value > value) {
            root.left = delete(value,root.left);
        }else {
//            Root with 1 child
            if(root.left == null)
                return root.right;
            else if(root.right == null)
                return root.left;
//            Root with 2 child
            root.value =minValue(root.right);
            root.right = delete(root.value, root.right);
        }
        return root;
    }

    private int minValue(Node root){
        int min = root.value;
        while(root.left != null) {
            min = root.left.value;
            root = root.left;
        }
        return min;
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
        BinarySearchTree tree = new BinarySearchTree();
        tree.insertmap(3);
        tree.insertmap(4);
        tree.insertmap(1);
        tree.insertmap(3);
        tree.insertmap(8);
        tree.inorderDisplayMap();
        System.out.println(tree.searchMap(8));
        tree.deleteMap(4);
        tree.inorderDisplayMap();
    }
}
