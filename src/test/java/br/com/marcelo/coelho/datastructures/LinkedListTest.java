package br.com.marcelo.coelho.datastructures;

import org.junit.jupiter.api.*;

class LinkedListTest {
    private LinkedList linkedList;

    @BeforeAll
    public void init() {
        linkedList = new LinkedList();
    }

    @Test
    public void addFront() {
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");


        Assertions.assertEquals(linkedList.size(), 4 );


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