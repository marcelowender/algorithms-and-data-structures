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
        linkedList.addFront("A");
        linkedList.addFront("B");
        linkedList.addFront("C");
        Assertions.assertEquals("A", linkedList.getLast());

    }

    @Test
    public void addBack() {
        LinkedList linkedList = new LinkedList();
        linkedList.addBack("A");
        linkedList.addBack("B");
        linkedList.addBack("C");
        linkedList.addBack(1);
        linkedList.addBack(true);
        Assertions.assertEquals(true, linkedList.getLast());

    }

    @Test
    public void delete() {
        LinkedList linkedList = new LinkedList();
        linkedList.addBack("A");
        linkedList.addBack("B");
        linkedList.addBack("C");
        linkedList.addBack("D");
        linkedList.addBack("E");
        linkedList.delete("E");
        Assertions.assertEquals("D", linkedList.getLast());

    }

    @Test
    public void contais() {
        LinkedList linkedList = new LinkedList();
        linkedList.addBack("A");
        linkedList.addBack("B");
        linkedList.addBack("E");

        Assertions.assertTrue(linkedList.contains("B"));
        Assertions.assertFalse(linkedList.contains("C"));

    }


    @Test
    public void addValueInIndex() {
        LinkedList linkedList = new LinkedList();
        linkedList.addBack("A");
        linkedList.addBack("B");
        linkedList.addBack("C");
        linkedList.addValueIndex("1", 0);
        linkedList.addValueIndex("2", 1);
        linkedList.addValueIndex("3", 2);
        Assertions.assertEquals(0, linkedList.indexOf("1"));
        Assertions.assertEquals(1, linkedList.indexOf("2"));
        Assertions.assertEquals(2, linkedList.indexOf("3"));
    }


    @Test
    public void getCount() {
        LinkedList linkedList = new LinkedList();
        linkedList.addBack("A");
        linkedList.addBack("B");
        linkedList.addBack("C");
        Assertions.assertEquals(3, linkedList.getCount());

    }

    @Test
    public void clear() {
        LinkedList linkedList = new LinkedList();
        linkedList.addBack("A");
        linkedList.addBack("B");
        linkedList.addBack("C");
        linkedList.clear();
        Assertions.assertEquals(0, linkedList.getCount());

    }

}