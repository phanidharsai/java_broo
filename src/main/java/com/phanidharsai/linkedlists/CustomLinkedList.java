package com.phanidharsai.linkedlists;

public class CustomLinkedList {
    private Node head;
    private Node tail;
    private int size;

//    public CustomLinkedList(){
//        this.size=0;
//    }
    public void addFirst(int value){
        Node temp = new Node(value);
        temp.next=head;
        head=temp;
        if(tail==null){
            tail=head;
        }
        size+=1;
    }
    public void addLast(int value){
        if(head!=null) {
            Node newNode = new Node(value);
            Node previous=head;
            Node current=head.next;
            while (current != null) {
                previous = current;
                current = current.next;
                System.out.println("P");

            }
            previous.next=newNode;
        }
        else {
            addFirst(value);
        }
    }
    public void removeFirst(){
        if(head.next!=null) {
            head = head.next;
        }
        else{
            head=null;
        }
    }

    public void printLinkedList(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.println("End");
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
