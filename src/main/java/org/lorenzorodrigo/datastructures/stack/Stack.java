package org.lorenzorodrigo.datastructures.stack;

import java.util.ArrayList;
import java.util.List;

/**
 * My <b>class</b>.
 *
 * @see Annotation
 * @param <T> This describes my type parameter
 */
public class Stack<T> {
    private List<T> elements;
    private int size;

    public Stack() {
        this.elements = new ArrayList<>();
        this.size = 0;
    }

    /**
     * My <b>class</b>.
     *
     */
    public T pop() {
        if (this.size <= 0) {
            return null;
        }
        int index = this.size - 1;
        T element = elements.get(index);

        // Remove from stack
        elements.remove(index);

        this.size--;

        return element;
    }

    /**
     * My <b>class</b>.
     *
     * @param element
     * @return boolean return
     */
    public int push(T element) {
        if (this.elements.add(element)) {
            this.size++;
            return this.size;
        } else {
            return -1;
        }
    }
}
