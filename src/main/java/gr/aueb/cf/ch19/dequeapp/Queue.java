package gr.aueb.cf.ch19.dequeapp;

import java.util.Deque;
import java.util.LinkedList;
import java.util.function.Consumer;

public class Queue<T> {
    private final Deque<T> queue;

    public Queue() {
        queue = new LinkedList<>();
    }

    public Deque<T> getQueue() {
        return queue;
    }

    //Inserts at the end of the queue
    public void enQueue(T t) {
        if (t == null) return;
        queue.addLast(t);
    }

    //Deleted from the beginning of the queue
    public T deQueue() {
        return queue.poll();
    }

    public void forEach(Consumer<T> action) {
        queue.forEach(action);
    }
}
