package com.LinkedList;

public class CreateLinkedList {
    Node head;

    public static void main(String []args) {
        CreateLinkedList linkedList = new CreateLinkedList();
        linkedList.head = new Node(1);
        Node second = new Node(5);
        Node third =  new Node(3);

        linkedList.head.next = second;
        second.next = third;
        linkedList.printLinkedList();
    }

    public void printLinkedList(){
        Node n = head;
        while(n!= null){
            System.out.print(n.data+ "->");
            n=n.next;

        }
    }
}
