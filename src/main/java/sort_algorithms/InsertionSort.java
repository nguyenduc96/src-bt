package sort_algorithms;

import java.util.Arrays;

public class InsertionSort {

    static int[] ints = {1, 7, 3, 8, 4, 56, 2, 4, 8, 4,5};

    public static void main(String[] args) {
        int[] a = sort(ints);
        System.out.println(Arrays.toString(a));
    }

    public static int[] sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
        return array;
    }

}
