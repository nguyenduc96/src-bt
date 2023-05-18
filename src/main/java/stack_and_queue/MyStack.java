package stack_and_queue;

import java.util.Arrays;

public class MyStack<E> implements Queue<E> {

    Object[] stacks;

    private int lastIndex = 0;

    private static final int DEFAULT_CAPACITY = 100;

    public MyStack() {
        stacks = new Object[DEFAULT_CAPACITY];
    }

    public MyStack(int initialCapacity) {
        stacks = new Object[initialCapacity];
    }

    public void printAll() {
        System.out.println(Arrays.toString(stacks));
    }

    @Override
    public boolean push(E e) {
        if (isFull()) {
            return false;
        } else {
            return add(e);
        }
    }

    private boolean add(E e) {
        if (isEmpty()) {
            stacks[0] = e;
        } else {
            stacks[lastIndex] = e;
        }
        lastIndex++;
        return true;
    }


    @Override
    @SuppressWarnings("unchecked")
    public E pop() {
        Object e = stacks[lastIndex - 1];
        lastIndex--;
        stacks[lastIndex] = null;
        return (E) e;
    }

    @Override
    public int size() {
        return lastIndex;
    }

    @Override
    @SuppressWarnings("unchecked")
    public E peek() {
        return (E) stacks[lastIndex - 1];
    }

    @Override
    public boolean isFull() {
        return lastIndex == stacks.length;
    }

    @Override
    public boolean isEmpty() {
        return lastIndex == 0;
    }
}
