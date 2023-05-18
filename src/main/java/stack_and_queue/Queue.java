package stack_and_queue;

public interface Queue<E> {

    boolean push(E e);

    E pop();

    E peek();

    int size();

    boolean isFull();

    boolean isEmpty();

    void printAll();
}
