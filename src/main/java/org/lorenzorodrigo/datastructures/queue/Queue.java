package org.lorenzorodrigo.datastructures.queue;

import java.util.ArrayList;
import java.util.List;

/**
 * Queue.
 *
 * @param <T> This describes my type parameter
 */
public class Queue<T> {
    private List<T> elements;
    private int size;

    public Queue() {
        this.elements = new ArrayList<>();
        this.size = 0;
    }

    /**
     * Enqueue element.
     *
     * @param element
     * @return boolean return
     */
    public int enqueue(T element) {
        this.elements.add(element);
        this.size++;

        return this.size;
    }

    /**
     * Dequeue element.
     *
     */
    public T dequeue() {
        if (this.size <= 0) {
            return null;
        }

        T element = this.elements.remove(0);
        this.size--;

        return element;
    }
}
