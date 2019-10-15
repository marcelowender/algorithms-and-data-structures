package br.com.marcelo.coelho.datastructures;

import org.junit.jupiter.api.*;

class LinkedListTest {

    @Test
    public void addFront() {
        LinkedList linkedList = new LinkedList();
        linkedList.addBack("B");
        linkedList.addBack("C");
        linkedList.addFront("A");
        Assertions.assertEquals("A", linkedList.getFirst());


    }

    @Test
    public void getFirst() {
        LinkedList linkedList = new LinkedList();
        linkedList.addBack("A");
        linkedList.addBack("B");
        linkedList.addBack("C");
        Assertions.assertEquals("A", linkedList.getFirst());

    }

    @Test
    public void getLast() {
        LinkedList linkedList = new LinkedList();
        linkedList.addBack("A");
        linkedList.addBack("B");
        linkedList.addBack("C");
       Assertions.assertEquals("C", linkedList.getLast());

    }

    @Test
    public void addBack() {
        LinkedList linkedList = new LinkedList();
        linkedList.addBack("A");
        linkedList.addBack("B");
        linkedList.addBack("C");
//        Assertions.assertEquals(linkedList.size(), linkedList.getLast());

    }

}