package br.com.marcelo.coelho.datastructures;

import org.junit.jupiter.api.*;

class QueueTest {

    @Test
    void add() {
        Queue queue = new Queue();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.remove();
    }

    @Test
    void remove() {
        Queue queue = new Queue();
        queue.add(1);
        queue.add(2);
        queue.remove();
    }
}