package com.company;
import java.util.*;
public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int size = 0;
//    Step1
    class Node{
        private int value;
        private Node next;
        private Node prev;
        Node(int value) {
            this.value = value;
        }
    }
    public void insertFirst(int value) {

        Node node = new Node(value);
        if(head == null){
            tail = node;
            head = node;
            return;
        }
        head.prev = node;
        node.next = head;
        node.prev = null;

        head = node;

        size++;
    }

    public void insertLast(int value) {
        if(head == null) {
            insertFirst(value);
            return;
        }
            Node node = new Node(value);
            tail.next = node;
            node.prev = tail;
            tail = node;
            size++;
    }

    public void insert(int index,int value) {
        if(size < index){
            return;
        }else if(index == 1){
            insertFirst(value);
            return;
        }else if(index == size){
            insertLast(value);
            return;
        }
        if(head == null) {
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        Node temp = head;
        while(index!=0){
            temp = temp.next;
            index--;
        }
        node.next = temp.next;
        temp.next = node;
        node.prev = temp;
        node.next.prev = node;
        size++;
    }

    public void deleteFirst() {
        head = head.next;
        head.prev = null;
        if(head == null) {
            tail = null;
        }
        size--;
    }
    public void deleteLast() {
        if(head == tail){
            deleteFirst();
        }
        tail = tail.prev;
        tail.next = null;
        if(tail == null) {
            head = null;
        }

        size--;
    }

    public void delete(int index) {
        if(head == tail || index == 0) {
            deleteFirst();
            return;
        }else if(index == size){
            deleteLast();
            return;
        }
        Node temp = head;
        while(index!=0 ) {
            temp = temp.next;
            index--;
        }
        System.out.println("Delete element " + temp.value);
        System.out.println("NODE : " + temp.prev.next.value);
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
        size--;
    }

    public boolean search(int value) {
        Node temp = head;
        while(temp!=null){
            if(temp.value == value)
            return true;
            temp = temp.next;
        }
        return false;
    }


    public void display() {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + "-->");
            temp = temp.next;
        }
        System.out.print("NULL");
    }


    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertFirst(3);
        list.insertFirst(5);
        list.insertFirst(8);
        list.insertLast(4);
        list.display();
        System.out.println();
        list.insert(2,11);
        list.display();
        System.out.println();
//        System.out.println("\ndelete first : ");
//        list.deleteFirst();
//        list.display();
//        System.out.println("\ndelete last : ");
//        list.deleteLast();
//        list.display();
        list.delete(2);
        System.out.println("\ndelete  : ");
        list.display();
        System.out.println(list.search(11));
    }

}
//