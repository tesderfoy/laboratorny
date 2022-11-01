package com.example.cerses;
public class LinkedList {
    private Node head;

    public LinkedList() {
        head = null;
    }

    public class Node {
        public Object data;
        public Node next;

        public Node(Object data) {
            this.data = data;
            next = null;
        }

    }

    public void add(Object data) {
        Node newNode = new Node(data);
        Node currentNode = head;

        if (head == null) {
            head = newNode;
        } else {
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }

    }

    public void remove(Object data) {
        Node currentNode = head;
        Node previousNode = null;

        while (currentNode.next != null) {

            if (currentNode.data == data) {
                if (currentNode == head) {
                    head = currentNode.next;
                } else {
                    previousNode.next = currentNode.next;
                }
            }
            previousNode = currentNode;
            currentNode = currentNode.next;
        }
    }

    public void print() {
        Node currentNode = head;
        if (head != null) {
            System.out.println(head.data);
        }

        while (currentNode.next != null) {
            currentNode = currentNode.next;
            System.out.println(currentNode.data);
        }
    }

}
