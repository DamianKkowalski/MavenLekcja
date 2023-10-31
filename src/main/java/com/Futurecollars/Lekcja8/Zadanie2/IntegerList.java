package com.Futurecollars.Lekcja8.Zadanie2;

import java.util.Arrays;

public class IntegerList implements OwnList {
    private Integer[] array;
    private final static int initialCapacity=10;
    private int size;

    public IntegerList() {
        this.array = new Integer[initialCapacity];
        this.size = 0;
    }

    @Override
    public int size()
    {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public void add(Integer element) {
        ensureCapacity();
    array[size++]=element;
    }

    @Override
    public Integer get(int i) {
        checkIndex(i);
        return array[i];
    }

    @Override
    public void add(int index, Integer element) {
        checkIndexForAdd(index);
        System.arraycopy(array, index, array, index + 1, size - index);
        array[index]=element;
        size++;
    }

    @Override
    public Integer remove(int index) {
        checkIndex(index);
        int removedElement = array[index];
        System.arraycopy(array, index + 1, array, index, size - index - 1);
        array[--size] = null;
        return removedElement;

    }
    private void ensureCapacity() {
        if (size == array.length) {
            int newCapacity = array.length * 2;
            array = Arrays.copyOf(array, newCapacity);
        }
    }
    private void checkIndex(int index)
    {
        if (index < 0 || index>=size)
            throw new IndexOutOfBoundsException("Index: "+index+" poza zasiegiem "+size);
    }
    private void checkIndexForAdd(int index)
    {
        if (index < 0 || index>size)
            throw new IndexOutOfBoundsException("Index: "+index+" poza zasiegiem "+size);
    }

}
