package br.com.marcelo.coelho.datastructures;


/**
 * Advantage:<br>
 * Insert Element and Delete have the time of O(1)
 * <p>
 * Disadvantage: comparing with arrays, the linked list dont have random access,
 * thats mean Get and Set with the time of O(n)
 * <p>
 * Can grow incrementally isn't necessary resize method
 * <p>
 * Ideal to use in Stacks or Queues
 */
public class LinkedList<T> {

    private int size;
    private Node<T> head;

    public void addBack(T value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node aux = head;
            while (aux.hasNext()) {
                aux = aux.getNext();
            }
            aux.setNext(newNode);
        }

        size++;

    }

    public int size() {

        return this.size;
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
