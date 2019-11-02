package br.com.marcelo.coelho.datastructures;

//TODO List advantages and disadvantages

/**
 * The intention here is understood what is the difference between DLL and SLL
 * When we can use DLL
 * <p>
 * Advantage:<br>
 * <p>
 * Disadvantage:
 */
public class DoublyLinkedList<T> {

    private int size;
    private Node<T> head;

    public void addBack(T value) {


    }

    public void addFront(T value) {

    }

    public void addValueIndex(T value, int index) {

    }

    public T getFirst() {
        return null;
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

        public Node(T value, Node<T> next, Node<T> prev) {
            this.data = value;
            this.next = next;
            this.prev = prev;
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
