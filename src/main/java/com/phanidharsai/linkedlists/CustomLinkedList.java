package com.phanidharsai.linkedlists;

public class CustomLinkedList {
    private Node head;
    private Node tail;
    private int size;

//    public CustomLinkedList(){
//        this.size=0;
//    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getSize() {
        return size;
    }

    public void addFirst(int value){
        Node temp = new Node(value);
        temp.next=head;
        head=temp;
        if(tail==null){
            tail=head;
        }
        size+=1;
    }
    public void insertAtIndex(int index,int value){
        if(index==0){
            addFirst(value);
            return;
        }
        if(index==this.getSize()-1){
            addLast(value);
            return;
        }
//        System.out.println(this.head+" check");
        Node tempo=head;
        for(int i=1;i<index;i++){
            tempo=tempo.next;
        }
        Node newNode = new Node(value,tempo.next);
        tempo.next=newNode;
        size++;

    }
//  ***********  when tail is not given *********
    public void addLast(int value){
        if(head!=null) {
            Node newNode = new Node(value);
            Node previous=head;
            Node current=head.next;
            while (current != null) {
                previous = current;
                current = current.next;
//                System.out.println("P");

            }
            previous.next=newNode;
            size+=1;
            return;
        }
            Node h = new Node(value);
            head=h;
            tail=head;
    }
    public Node removeFirst(){
        if(head.next!=null) {
            head = head.next;
            size--;
            return head;
        }
        head = null;
        size = 0;
        return head;
    }
    public Node removeAtIndex(Node head, int index){
        if(index==0){
            return removeFirst();
        }
        if(index==size-1){
            return removeLast();
        }
        int initialIndex=1;
        Node h = head;
        Node deletingNode= h.next;
        Node temp=null;
        while(deletingNode!=null){
            if(initialIndex==index){
                temp=deletingNode.next;
                h.next=temp;
                size--;
                return head;
            }
            initialIndex++;
            deletingNode=deletingNode.next;
            h=h.next;

        }
        return head;
    }
    public Node removeLast(){
        Node previous= head;
        while(previous!=tail){
            previous= previous.next;
//            System.out.println("L");
        }
        previous.next=null;
        tail=previous;
        size--;
        return head;
//        System.out.println(previous);
    }

    public void printLinkedList(Node head){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.println("End");
    }
    public Node reverse(Node head){
        Node newHead = null;
        while(head!=null) {
            Node nextNode = head.next;
            head.next = newHead;
            newHead = head;
            head = nextNode;
        }
//        this.head=newHead;
        return newHead;
    }

    public class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", next=" + next +
                    '}';
        }
    }
}
