package com.Futurecollars.Lekcja8.Zadanie3;

public class CustomDoublyLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public CustomDoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void addLast(T data) {
        Node<T> newNode = new Node<>(data, tail, null);
        if (tail != null) {
            tail.next = newNode;
        }
        tail = newNode;
        if (head == null) {
            head = newNode;
        }
        size++;
    }

    public void addAtIndex(int index, T data) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        if (index == size) {
            addLast(data);
            return;
        }

        Node<T> currentNode = getNodeAtIndex(index);
        Node<T> newNode = new Node<>(data, currentNode.prev, currentNode);
        if (currentNode.prev != null) {
            currentNode.prev.next = newNode;
        } else {
            head = newNode;
        }
        currentNode.prev = newNode;
        size++;
    }

    public void removeAtIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        Node<T> currentNode = getNodeAtIndex(index);
        if (currentNode.prev != null) {
            currentNode.prev.next = currentNode.next;
        } else {
            head = currentNode.next;
        }

        if (currentNode.next != null) {
            currentNode.next.prev = currentNode.prev;
        } else {
            tail = currentNode.prev;
        }

        size--;
    }

    public int size() {
        return size;
    }

    private Node<T> getNodeAtIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        Node<T> currentNode;
        if (index < size / 2) {
            currentNode = head;
            for (int i = 0; i < index; i++) {
                currentNode = currentNode.next;
            }
        } else {
            currentNode = tail;
            for (int i = size - 1; i > index; i--) {
                currentNode = currentNode.prev;
            }
        }

        return currentNode;
    }
}
