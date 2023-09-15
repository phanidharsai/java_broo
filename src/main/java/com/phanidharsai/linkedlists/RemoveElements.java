package com.phanidharsai.linkedlists;

import java.util.ArrayList;
import java.util.LinkedList;

public class RemoveElements {
    public static void main(String[] args){
            CustomLinkedList ll =  new CustomLinkedList();
            ll.addFirst(3);
//            ll.addFirst(6);
//            ll.addFirst(8);
//            ll.addFirst(5);
//            ll.addLast(9);
            ll.removeFirst();
//            ll.removeLast();
            ll.printLinkedList();
    }
}
