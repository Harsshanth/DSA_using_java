package com.company;

public class Stack {
    Node top;
    static int size = 0;

    // NODE class
    class Node {
        int value;
        Node next;
        Node prev;
        Node(int value) {
            this.value = value;
        }
    }

    //push
    public void push(int value) {
        Node node = new Node(value);
        if(top == null){
            top = node;
            return;
        }
        node.prev = top;
        node.next = null;
        top.next = node;
        top = node;
    }

    public void pop() {
        if(top == null)
            return;
        top = top.prev;
        top.next = null;
    }

    public void peek() {
        System.out.println(top.value);
    }

    public boolean search(int value) {
        Node temp = top;
        while(temp != null) {
            if(temp.value == value)
                return true;
            temp = temp.prev;
        }
        return false;
    }

    public void display() {
        Node temp = top;
        while(temp != null) {

            System.out.print(temp.value + "-->");
            temp = temp.prev;
        }
        System.out.print("null");
    }

    public static void main(String[] args){
        Stack stack = new Stack();
        stack.push(5);
        stack.push(8);
        stack.push(3);
        stack.push(6);
        stack.display();
        stack.pop();
        System.out.println();
        stack.display();
        System.out.println("\n" + stack.search(6));
        stack.peek();

    }

}
