package br.com.marcelo.coelho.datastructures;

import jdk.nashorn.internal.ir.annotations.*;
import org.junit.jupiter.api.*;

class DoublyLinkedListTest {

    @Test
    void addFront() {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addFront("A");
        Assertions.assertEquals("A", list.getFirst());
        list.addFront("B");
        Assertions.assertEquals("B", list.getFirst());
        list.addFront("C");
        Assertions.assertEquals("C", list.getFirst());
        list.addFront("D");
        Assertions.assertEquals("D", list.getFirst());
    }

    @Test
    void addBack() {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addBack("A");
        Assertions.assertEquals("A", list.getLast());
        list.addBack("B");
        Assertions.assertEquals("B", list.getLast());
        list.addBack("C");
        Assertions.assertEquals("C", list.getLast());
        list.addBack("D");
        Assertions.assertEquals("D", list.getLast());
    }

    @Test
    void delete() {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addBack("A");
        list.addBack("B");
        list.addBack("C");
        list.addBack("D");
        list.delete("A");
        list.delete("C");
        Assertions.assertEquals("B", list.getFirst());

    }

    @Test
    @Ignore
    void addValueIndex() {
    }

    @Test
    @Ignore
    void indexOf() {
    }

    @Test
    @Ignore
    void contains() {
    }

    @Test
    @Ignore
    void getCount() {
    }

    @Test
    @Ignore
    void clear() {
    }

    @Test
    void print() {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addBack("1");
        list.addBack("2");
        list.addBack("3");
        list.addBack("4");

        list.print();
    }


}