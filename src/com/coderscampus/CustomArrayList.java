package com.coderscampus;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
    private Object[] elements = new Object[10];
    private int size = 0; // number of elements in the list

    @Override
    public boolean add(T item) {
        if (size == elements.length) { // if the array is full, double its size
            elements = Arrays.copyOf(elements, elements.length * 2);
        }
        elements[size] = item;
        size++;// add the new element to the end of the array
        return true;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (T) elements[index];
    }

}