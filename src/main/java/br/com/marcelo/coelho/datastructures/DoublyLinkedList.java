package br.com.marcelo.coelho.datastructures;

//TODO List advantages and disadvantages

/**
 * The intention here is understood what is the difference between DLL and SLL
 * When we can use DLL
 *
 * Advantage:<br>
 * <p>
 * Disadvantage:
 */
public class DoublyLinkedList<T> {

    private int size;
    private Node<T> head;


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
