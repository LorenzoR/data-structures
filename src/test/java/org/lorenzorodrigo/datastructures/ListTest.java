package org.lorenzorodrigo.datastructures;

import org.junit.jupiter.api.Test;
import org.lorenzorodrigo.datastructures.list.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit test for simple App.
 */
class ListTest {

    // Initial capacity of list is 10
    private static final int INITIAL_CAPACITY = 10;

    /**
     * Rigorous Test.
     */
    @Test
    void testNewIntList() {
        List<Integer> list = new List<>();
        assertNotNull(list);
    }

    /**
     * Test add.
     */
    @Test
    void testAdd() {
        List<Integer> list = new List<>();
        assertEquals(true, list.add(1), "Add works");
    }

    /**
     * Test add more than initial capacity.
     */
    @Test
    void testAddMoreThanInitialCapacity() {
        List<Integer> list = new List<>();

        for (int i = 0; i < INITIAL_CAPACITY + 1; i++) {
            assertTrue(list.add(i));
        }
    }

    /**
     * Test get.
     */
    @Test
    void testGet() {
        List<Integer> list = new List<>();
        int element = 1;
        list.add(element);

        assertEquals(element, list.get(0), "Get works");
    }

    /**
     * Test add invalid index.
     */
    @Test
    void testGetInvalidIndex() {
        List<Integer> list = new List<>();

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            list.get(0);
        });
    }

    /**
     * Test get size.
     */
    @Test
    void testGetSize() {
        List<Integer> list = new List<>();
        int element = 1;
        list.add(element);

        assertEquals(1, list.size(), "Size works");
    }

    /**
     * Test remove.
     */
    @Test
    void testRemove() {
        List<Integer> list = new List<>();
        int element = 1;
        list.add(element);

        assertEquals(1, list.remove(0), "Size works");
        assertEquals(0, list.size(), "Size works");
    }
}
