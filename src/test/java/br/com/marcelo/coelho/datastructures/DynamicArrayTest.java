package br.com.marcelo.coelho.datastructures;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class DynamicArrayTest {

    @Test
    void getAndSetTest() {
        DynamicArray dynamicArray = new DynamicArray(1);
        dynamicArray.set(0, "hello");
        assertEquals("hello", dynamicArray.get(0));
    }


    @Test
    void insertTest() {
        DynamicArray dynamicArray = new DynamicArray(5);
        dynamicArray.add("a");
        dynamicArray.add("c");
        dynamicArray.add("d");
        dynamicArray.insert(1, "b");
        assertEquals(dynamicArray.size(), 4);
    }

    @Test
    void deleteTest() {
        DynamicArray dynamicArray = new DynamicArray(5);
        dynamicArray.add("a");
        dynamicArray.add("b");
        dynamicArray.add("c");
        dynamicArray.delete(1);
        assertEquals(dynamicArray.size(), 2);
    }

    @Test
    void isEmptyTest() {
        DynamicArray dynamicArray = new DynamicArray(5);
        assertTrue(dynamicArray.isEmpty());
    }


    @Test
    void containsTest() {
        DynamicArray dynamicArray = new DynamicArray(5);
        dynamicArray.add("a");
        assertTrue(dynamicArray.contains("a"));
    }


}