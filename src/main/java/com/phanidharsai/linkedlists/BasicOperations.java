package com.phanidharsai.linkedlists;

public class BasicOperations {
    public static void main(String[] args){
            CustomLinkedList ll =  new CustomLinkedList();
            ll.addFirst(3);
            ll.addFirst(6);
            ll.addFirst(8);
            ll.addFirst(5);
            ll.addLast(9);
            ll.removeFirst();
            ll.removeLast();
            System.out.println(ll.getHead());
            ll.printLinkedList(ll.getHead());
            ll.reverse(ll.getHead());
            ll.printLinkedList(ll.getHead());
            System.out.println(ll.getHead());
            ll.insertAtIndex(1,5);
            ll.printLinkedList(ll.getHead());
    }
}
