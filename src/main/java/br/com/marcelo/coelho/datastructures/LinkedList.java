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

    public void add(T value) {
        Node newNode = new Node(value);
        size++;
    }

    public int size() {

        return this.size;
    }

    private static class Node<T> {
        T data;
        Node next;

        public Node(T value) {
            this.data = value;
        }

    }


}
