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
            head = newNode;//O(1)
        } else {
            Node aux = head;
            while (aux.hasNext()) {//O(n)
                aux = aux.getNext();
            }
            aux.setNext(newNode);
        }
        size++;

    }

    public void addFront(T value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
        size++;
    }

    public void addValueIndex(T value, int index) {

        int numberOfNodes = 1;

        if (index == 0) {
            addFront(value);
            return;
        }

        Node aux = head;
        while (aux != null) {
            if (numberOfNodes == index) {
                Node newNode = new Node(value);
                newNode.setNext(aux.getNext());
                aux.setNext(newNode);
                return;
            }
            aux = aux.getNext();
            numberOfNodes++;

        }

    }

    public T getFirst() {
        return this.head.data;
    }

    public T getLast() {
        Node aux = head;
        while (aux.hasNext()) {
            aux = aux.getNext();
        }

        return (T) aux.getData();
    }

    public void delete(T value) {
        Node aux = head;
        if (aux.getData().equals(value)) {
            head = aux.getNext();
            size--;
            return;
        } else {
            while (aux.hasNext()) {
                if (aux.getNext().getData().equals(value)) {
                    aux.setNext(aux.getNext().getNext());
                    size--;
                    return;
                }
                aux = aux.getNext();
            }
        }


    }

    public int indexOf(T value) {
        Node aux = head;
        int indexElement = 0;
        while (aux != null) {
            if (aux.getData().equals(value)) {
                return indexElement;
            }
            indexElement++;
            aux = aux.getNext();
        }
        return indexElement;
    }

    public boolean contains(T value) {
        Node aux = head;
        while (aux.getNext() != null) {
            aux = aux.getNext();
            if (aux.getData().equals(value)) {
                return true;
            }
        }

        return false;
    }

    /**
     * Exercise extracted from
     * https://practice.geeksforgeeks.org/problems/count-nodes-of-linked-list/1
     * Your task is to complete the given function getCount(), which takes head reference as argument and should return the length of linked list.
     *
     * @return length of linked list
     */
    public int getCount() {
        int numberOfNodes = 0;
        Node aux = head;
        while (aux != null) {
            aux = aux.getNext();
            numberOfNodes++;
        }
        return numberOfNodes;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        Node aux = head;
        while (aux != null) {
            System.out.println(aux.getData());
            aux = aux.getNext();
        }
        System.out.println("------");
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
