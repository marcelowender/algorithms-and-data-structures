package br.com.marcelo.coelho.datastructures;

//TODO List advantages and disadvantages

/**
 * This study is strongly based on https://www.geeksforgeeks.org/doubly-linked-list/
 * The intention here is understood what is the difference between DLL and SLL
 * When we can use DLL
 * <p>
 * Advantage:<br>
 * A DLL can be traversed in both forward and backward direction <br>
 * The delete operation in DLL is more efficient if pointer to the node to be deleted is given <br>
 * We can quickly insert a new node before a given node.
 * <p>
 * Disadvantage:
 * Every node of DLL Require extra space for an previous pointer (There is XOR implementation to solve this) <br>
 * All operations require an extra pointer previous to be maintained
 */
public class DoublyLinkedList<T> {

    private int size;
    private Node<T> head;


    public void addFront(T value) {

        if (head == null) {
            head = new Node(value);
            return;
        }

        Node newNode = new Node(value);
        newNode.prev = null;
        newNode.next = head;


        head.prev = newNode;
        head = newNode;

    }

    public void addBack(T value) {
        if (head == null) {
            head = new Node(value);
            return;
        }



    }


    public void addValueIndex(T value, int index) {

    }

    public T getFirst() {
        return head.getData();
    }

    public T getLast() {
        return null;
    }

    public void delete(T value) {

    }

    public int indexOf(T value) {
        return 0;
    }

    public boolean contains(T value) {
        return false;
    }

    public int getCount() {
        return 0;
    }

    public void clear() {

    }

    public void print() {
    }

    public int size() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    private static class Node<T> {
        private T data;
        private Node next;
        private Node prev;

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

        public Node getPrev() {
            return prev;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }
    }


}
