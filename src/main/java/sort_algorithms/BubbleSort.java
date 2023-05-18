package sort_algorithms;

import java.util.Arrays;

public class BubbleSort {

    static int[] ints = {1, 7, 3, 8, 4, 56, 2, 4, 8, 4,5,1,2,21,2,31,3};

    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
//        System.out.println(Arrays.toString(sort(ints)));
    }
}
