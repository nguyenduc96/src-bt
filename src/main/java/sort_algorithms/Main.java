package sort_algorithms;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int len = 100000;
        Random random = new Random();
        int[] ints = new int[len - 1];
        for (int i = 0; i < len -1; i++) {
            ints[i] = random.nextInt(len);
        }

        System.out.println(ints.length);

        long s1 = System.currentTimeMillis();
//        BubbleSort.sort(ints);
        long s2 = System.currentTimeMillis();
        System.out.println("Bubble sort " + (s2 - s1));
//        InsertionSort.sort(ints);
        long s3 = System.currentTimeMillis();
        System.out.println("InsertionSort " + (s3 - s2));
        MergeSort mergeSort = new MergeSort();
//        mergeSort.sort(ints);
        long s4 = System.currentTimeMillis();
        System.out.println("MergeSort " + (s4 - s3));
        QuickSort.sort(ints);
        long s5 = System.currentTimeMillis();
        System.out.println("QuickSort " + (s5 - s4));

    }
}
