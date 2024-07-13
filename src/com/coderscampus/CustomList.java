package com.coderscampus;

public interface CustomList<T> {

    void add(T item);

    int getSize();

    T get(int index);

}
