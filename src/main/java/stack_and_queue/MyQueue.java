package stack_and_queue;

import java.util.Arrays;

public class MyQueue<E> implements Queue<E> {
    Object[] queues;

    private int lastIndex = 0;

    private static final int DEFAULT_CAPACITY = 100;

    public MyQueue() {
        queues = new Object[DEFAULT_CAPACITY];
    }
    public MyQueue(int initialCapacity) {
        queues = new Object[initialCapacity];
    }
    @Override
    public boolean push(E e) {
        if (isFull()) throw new RuntimeException("Queue is full!!");
        queues[lastIndex++] = e;
        return true;
    }

    @Override
    public int size() {
        return lastIndex;
    }

    @Override
    @SuppressWarnings("unchecked")
    public E pop() {
        if (isEmpty()) throw new RuntimeException("Queue is empty!!");
        E obj = (E) queues[0];
        queues = Arrays.copyOfRange(queues, 1, lastIndex + 1);
        lastIndex--;
        return obj;
    }

    @Override
    @SuppressWarnings("unchecked")
    public E peek() {
        if (isEmpty()) throw new RuntimeException("Queue is empty!!");
        return (E) queues[0];
    }

    @Override
    public boolean isFull() {
        return lastIndex == queues.length;
    }

    @Override
    public boolean isEmpty() {
        return lastIndex == 0;
    }

    @Override
    public void printAll() {
        System.out.println(Arrays.toString(queues));
    }
}
