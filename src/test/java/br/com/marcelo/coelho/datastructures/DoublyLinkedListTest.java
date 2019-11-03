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
    @Ignore
    void addBack() {
    }

    @Test
    @Ignore
    void addValueIndex() {
    }

    @Test
    void getFirst() {

    }

    @Test
    @Ignore
    void getLast() {
    }

    @Test
    @Ignore
    void delete() {
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
    @Ignore
    void print() {
    }

    @Test
    @Ignore
    void size() {
    }

    @Test
    @Ignore
    void isEmpty() {
    }
}