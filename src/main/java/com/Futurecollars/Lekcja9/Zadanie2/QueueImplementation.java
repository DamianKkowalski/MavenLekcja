package com.Futurecollars.Lekcja9.Zadanie2;

import java.util.ArrayList;
import java.util.List;

public class QueueImplementation implements OwnQueue {
    private List<Integer> queue;

    public QueueImplementation()
    {
        this.queue= new ArrayList<>();
    }

    @Override
    public boolean add(Integer e) {
        if (e == null) {
            throw new NullPointerException("Element cannot be null");
        }
        return queue.add(e);
    }

    @Override
    public Integer remove() {
        if (queue.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue.remove(0);
    }

    @Override
    public Integer element() {
        if (queue.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue.get(0);
    }

}
