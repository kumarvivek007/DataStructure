package kv.LL.Default;

/**
 * Created by i339759 on 28/06/18.
 */
public class LinkedList {
    Node head;
    static class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
            this.next =null;
        }

    }

    public Node append(int data) {
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else{
            /* first  iterate till the last node and then append the node to the list*/
            Node tail = head;
            while (tail.next != null) {
                tail = tail.next;
            }
            /* Now Add the new Node to the List*/
            tail.next =newNode;
        }

        return head;
    }
    public void printLinkedList(){
        if(head == null){
            System.out.println("The List is empty");
            return;
        }
        /* first  iterate till the last node and then append the node to the list*/
        Node tail = head;
        while (tail != null) {
            System.out.print(tail+" -> ");
            tail = tail.next;
        }


    }

    public static void main(String[] args){
        int[] int_arr = {10,1,5,9,12,2,8,3};
        LinkedList list = new LinkedList();
        list.printLinkedList();
        for(int data : int_arr){
            list.append(data);
        }
        list.printLinkedList();
    }

}
