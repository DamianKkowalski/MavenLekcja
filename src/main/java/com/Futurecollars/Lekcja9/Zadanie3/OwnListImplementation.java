package com.Futurecollars.Lekcja9.Zadanie3;

import java.util.Arrays;

public class OwnListImplementation<E>  implements OwnList<E>{
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;
    private int size;
    public OwnListImplementation()
    {
        elements = new Object[DEFAULT_CAPACITY];
    }


    @Override
    public boolean add(E e) {
        elements[size++] = e;
        return true;
    }

    @Override
    public E get(int index) {
        return (E) elements[index];
    }

    @Override
    public boolean remove(E o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elements[i])) {
                removeElementAtIndex(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }
    private void ensureCapacity() {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, size * 2);
        }
    }
    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }
    private void removeElementAtIndex(int index) {
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(elements, index + 1, elements, index, numMoved);
        }
        elements[--size] = null;
    }
}
