package com.company;

public class Queue {
    Node start;
    Node end;
    int size = 0;
    class Node {
        int value;
        Node next;
        Node prev;
        Node(int value) {
            this.value = value;
        }
    }
    public void enqueue(int value) {
        Node node = new Node(value);
        node.prev = null;
        node.next = null;
        if(start == null){
            start = node;
            end = node;
            return;
        }
        end.next = node;
        end = node;
    }

    public void dequeue() {
        start = start.next;
        if(start == null) {
         end = null;
         return;
        }
        start.prev = null;
    }

    public void peek() {
        System.out.println(start.value);
    }

    public void display() {
        Node temp = start;
        while(temp != null) {
            System.out.print(temp.value + "-->");
            temp = temp.next;
        }
        System.out.print("NULL");
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.display();
        queue.dequeue();
        System.out.println();
        queue.display();
        System.out.println();
        queue.peek();
    }
}
