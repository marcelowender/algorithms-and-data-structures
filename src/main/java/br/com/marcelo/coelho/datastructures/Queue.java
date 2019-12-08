package br.com.marcelo.coelho.datastructures;

/**
 * Queues work through the First In, First Out approach.
 * For example:
 * Condsider the Linkedlist  1->2->3->4->5
 * The first element in this linkedList is 1 and the last element is 5
 * The one way to remove elements in this list is removing the first element
 * the implementation remove() remove one element from HEAD.
 */
public class Queue<T> {


    private Node head;
    private Node tail;

    public void add(T data) {
        Node newNode = new Node(data);
        if (tail != null) {
            tail.setNext(newNode);
        }
        tail = newNode;
        if (head == null) {
            head = tail;
        }

    }


    public void remove() {
        if (head == null) {
            return;
        }

        head = head.next;
    }


    private static class Node<T> {
        private T data;
        private Node next;

        public Node(T value) {
            this.data = value;
        }

        public Node<T> getNext() {
            return this.next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public T getData() {
            return this.data;
        }

        public boolean hasNext() {
            return this.next != null;
        }
    }
}



