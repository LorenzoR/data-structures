package org.lorenzorodrigo.datastructures.list;

import java.util.Arrays;

/**
 * <b>List</b>.
 *
 * @param <T> This describes my type parameter
 */
public class List<T> {
    // Initial capacity of list is 10
    private static final int INITIAL_CAPACITY = 10;

    private Object[] elements;

    private int size;

    public List() {
        this.elements = new Object[INITIAL_CAPACITY];
    }

    /**
     * Add element to list.
     *
     * @param element
     * @return boolean
     */
    public boolean add(T element) {
        if (this.size == this.elements.length) {
            this.increaseCapacity(this.size + INITIAL_CAPACITY);
        }
        this.elements[this.size++] = element;
        return true;
    }

    private void increaseCapacity(int newSize) {
        this.elements = Arrays.copyOf(elements, newSize);
    }

    /**
     * Get element from list.
     *
     * @param index
     * @return element
     */
    @SuppressWarnings("unchecked")
    public T get(int index) {
        if (index >= this.size || index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }

        return (T) this.elements[index];
    }

    /**
     * Get element size.
     *
     */
    public int size() {
        return this.size;
    }

    /**
     * Remove element.
     *
     * @param index index
     *
     */
    public T remove(int index) {
        T element = this.get(index);

        Object[] copyArray = new Object[this.size - 1];

        // copy elements from original array from beginning till index into copyArray
        System.arraycopy(this.elements, 0, copyArray, 0, index);

        // copy elements from original array from index+1 till end into copyArray
        System.arraycopy(this.elements, index + 1, copyArray, index, this.size - index - 1);

        this.size--;

        return element;
    }
}
