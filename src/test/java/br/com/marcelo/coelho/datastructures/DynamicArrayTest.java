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
        dynamicArray.set(0, "a");
        dynamicArray.set(1, "c");
        dynamicArray.set(2, "d");


        dynamicArray.insert(1, "b");
    }

}