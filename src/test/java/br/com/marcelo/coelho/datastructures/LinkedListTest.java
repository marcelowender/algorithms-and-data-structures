package br.com.marcelo.coelho.datastructures;

import org.junit.jupiter.api.*;

class LinkedListTest {

    @Test
    public void addFront() {
        LinkedList linkedList = new LinkedList();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");
        linkedList.add("E");
        linkedList.add("F");


        Assertions.assertEquals(linkedList.size(), 6);


    }

    @Test
    public void getFirst() {

    }

    @Test
    public void getLast() {

    }

    @Test
    public void addBack() {

    }

}