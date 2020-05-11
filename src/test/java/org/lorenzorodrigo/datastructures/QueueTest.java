package org.lorenzorodrigo.datastructures;

import org.junit.jupiter.api.Test;
import org.lorenzorodrigo.datastructures.queue.Queue;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Unit test for simple App.
 */
class QueueTest {
    /**
     * Rigorous Test.
     */
    @Test
    void testNewIntQueue() {
        Queue<Integer> queue = new Queue<>();
        assertNotNull(queue);
    }

    /**
     * Test push.
     */
    @Test
    void testEnqueue() {
        Queue<Integer> queue = new Queue<>();
        assertEquals(1, queue.enqueue(1), "Enqueue works");
    }

    /**
     * Test pop.
     */
    @Test
    void testDequeue() {
        Queue<Integer> queue = new Queue<>();
        int element = 1;
        queue.enqueue(element);

        assertEquals(element, queue.dequeue(), "Dequeue works");
    }
}
