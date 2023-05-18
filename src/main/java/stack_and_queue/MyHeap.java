package stack_and_queue;

public class MyHeap<E> {
    private Object[] heaps;

    private int size = 0;
    private static final int DEFAULT_CAPACITY = 100;

    private HeapType type;

    public MyHeap() {
        type = HeapType.MINHEAP;
        heaps = new Object[DEFAULT_CAPACITY + 1];
    }

    public MyHeap(HeapType heapType) {
        type = heapType;
        heaps = new Object[DEFAULT_CAPACITY + 1];
    }


    public MyHeap(int initialCapacity) {
        type = HeapType.MINHEAP;
        heaps = new Object[initialCapacity + 1];
    }

    public MyHeap(HeapType heapType, int initialCapacity) {
        type = heapType;
        heaps = new Object[initialCapacity + 1];
    }


    public enum HeapType {
        MINHEAP,
        MAXHEAP
    }

    @SuppressWarnings("unchecked")
    public E peek() {
        if (isEmpty()) throw new RuntimeException("Heaps is empty!!");
        return (E) heaps[1];
    }

    public boolean push(E e){
        size++;
        heaps[size] = e;
        heapifyUp();
        return true;
    }

    @SuppressWarnings("unchecked")
    public E pop() {
        if (isEmpty()) throw new RuntimeException("Heaps is empty!!");
        return (E) heaps[1];
    }

    private void heapifyUp() {
        int currIndex = size;
        int parentIndex = currIndex / 2;
        while (parentIndex != 0) {
            swap(parentIndex, currIndex);
            currIndex = parentIndex;
            parentIndex = currIndex / 2;
        }
    }

    @SuppressWarnings("unchecked")
    private void swap(int i, int j) {
        E t = (E) heaps[i];
        heaps[i] = heaps[j];
        heaps[j] = t;
    }


    public int size() {
        return size;
    }

    public boolean isFull() {
        return size == heaps.length -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void printAll() {

    }
}
