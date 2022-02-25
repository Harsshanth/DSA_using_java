package com.company;

public class LinkedList_mine {

    /*
    Properties of LinkedList is head , tail , size of linkeddlist
    head and tail store the value of node so type is node
     */

    private Node head;
    private  Node tail;
    private int size;

    LinkedList_mine(){
        this.size = 0;
    }

    /* Created a node class
        3 --> 4 --> 5 --> Null
        Here first node 3 has two parameter value : 3 and next : address of next
        So property of node contains value and next
     */
    private class Node {

        private int value;
        private Node next; // default it is null

        public Node(int value) {
            this.value  = value;
        }

        public Node(int value, Node next) {
            this.value  = value;
            this.next = next;
        }
    }

    //InsertFirst

    /*
        3 --> 4 --> null
        Add 5 in first so
        node.next = head --> make 5 to point on three
        After that down we changed the position of head
     */
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head =  node;

        if(tail == null){
            tail = head;
        }

        size++;
    }

    public void insertLast(int val) {
        if(tail == null) { // check the node is empty
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val, int index) {

        if(head == null || index == 0 ){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
        }

        Node temp = head;
        while( index != 0 ) {
            temp = temp.next;
            index -- ;
        }

        Node node = new Node(val);
        node.next = temp.next;
        temp.next = node;
        size++;
    }

    public void deleteFirst(){
        head = head.next;
        if(head == null) {
            tail = null;
        }
        size--;
    }

    public void deleteLast() {
        if(size <= 1){
            deleteFirst();
            return;
        }
         Node temp = head;
         int secondLast = size-2 ;

         while(secondLast != 0){
             temp = temp.next;
             secondLast--;
         }
         tail = temp;
         tail.next = null;
         size--;
    }

    public void delete(int index) {

        if(index == 0) {
            deleteFirst();
            return;
        }else if(index == size-1){
            deleteLast();
            return;
        }
        Node temp = head;
        while (index != 0){
            temp = temp.next;
            index--;
        }
        temp.next = temp.next.next;
        size--;
    }
    /*
    Create temp node = head;
    Because head should not change from first element
     */
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + "-->");
            temp = temp.next;
        }
        System.out.print("End\n");
    }

    public int find(int value) {
        int countIndex = 0;
        Node temp = head;
        while(temp != null){
            countIndex++;
            if(temp.value == value){
                return countIndex;
            }
            temp = temp.next;
        }
        return 0;
    }





    public static void main(String[] args){

        LinkedList_mine list = new LinkedList_mine();
        list.insertFirst(3);
        list.insertFirst(18);
        list.insertFirst(8);
        list.insertLast(45);
        list.insertLast(33);
        list.insert(2,2-1);
        list.display();
        list.deleteFirst();
        list.deleteLast();
        list.display();
        list.delete(2-1);
        list.display();
        System.out.println(list.find(45));
    }
}
