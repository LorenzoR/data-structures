package org.lorenzorodrigo.datastructures;

import org.junit.jupiter.api.Test;
import org.lorenzorodrigo.datastructures.stack.Stack;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Unit test for simple App.
 */
class StackTest {
    /**
     * Rigorous Test.
     */
    @Test
    void testNewIntStack() {
        Stack<Integer> stack = new Stack<>();
        assertNotNull(stack);
    }

    /**
     * Test push.
     */
    @Test
    void testPush() {
        Stack<Integer> stack = new Stack<>();
        assertEquals(1, stack.push(1), "Push works");
    }

    /**
     * Test pop.
     */
    @Test
    void testPop() {
        Stack<Integer> stack = new Stack<>();
        int element = 1;
        stack.push(element);

        assertEquals(element, stack.pop(), "Pop works");
    }

    /**
     * Test pop no elements.
     */
    @Test
    void testPopNoElements() {
        Stack<Integer> stack = new Stack<>();

        assertEquals(null, stack.pop(), "Pop works");
    }
}
