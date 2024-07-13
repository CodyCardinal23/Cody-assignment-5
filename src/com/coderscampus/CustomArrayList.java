package com.coderscampus;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
    private Object[] items = new Object[10];
    private int size = 0;

    @Override
    public void add(T item) {
        if (isFull()) {
            increaseCapacity();
        }
        items[size] = item;
        size++;
    }

    private boolean isFull() {
        return size == items.length;
    }

    private void increaseCapacity() {
        items = Arrays.copyOf(items, items.length * 2);
        System.out.println("\nSize Doubled!\n");
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid Index. Requested index is outside of current array size.");
        }
        //noinspection unchecked
        return (T) items[index];
    }
}