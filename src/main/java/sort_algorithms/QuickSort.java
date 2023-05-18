package sort_algorithms;

import java.util.Arrays;

public class QuickSort {

    static int[] ints = {1, 7, 3, 8, 4, 56, 2, 4, 8, 4, 5, 1, 2, 21, 2, 31, 3};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sort(ints)));
    }

    static int[] sort(int[] array) {
        return quickSort(array, 0, array.length - 1);
    }

    static int[] quickSort(int[] array, int L, int R) {
        if (L >= R) return array;
        int divIndex = partition(array, L, R);
        quickSort(array, L, divIndex - 1);
        quickSort(array, divIndex, R);
        return array;
    }

    static int partition(int array[], int L, int R) {
        int iL = L;
        int iR = R;
        int pivot = array[(L + R) / 2];
        while (iL <= iR) {
            while (array[iL] < pivot) iL++;
            while (array[iR] > pivot) iR--;
            if (iL <= iR) {
                swap(array, iL, iR);
                iL ++; iR --;
            }
        }
        return iL;
    }

    static void swap(int[] array, int iL, int iR) {
        int temp = array[iL];
        array[iL] = array[iR];
        array[iR] = temp;
    }
}
