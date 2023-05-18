package sort_algorithms;

import java.util.Arrays;
import java.util.LinkedList;

public class MergeSort {
    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        int[] arr = {1,43,6,4234,65,534,534,534,5345,345,34536,45,674,7};
        int[] res = mergeSort.sort(arr);
        System.out.println(Arrays.toString(res));

    }


    public int[] sort(int[] arr) {
        return mergeSort(arr, 0, arr.length -1);
    }

    public int[] mergeSort(int[] arr, int L, int R) {
        if (L > R) return new int[0];
        if (L == R) return new int[]{arr[L]};

        int middleIndex = (L + R) / 2;

        int[] leftArray = mergeSort(arr, L, middleIndex);
        int[] rightArray = mergeSort(arr, middleIndex + 1, R);

        return merge(leftArray, rightArray);
    }

    private int[] merge(int[] leftArray, int[] rightArray) {
        int len = leftArray.length + rightArray.length;

        int indexRs = 0;
        int left = 0;
        int right = 0;
        int[] result = new int[len];

        while (indexRs < len) {

            //
            if (left < leftArray.length && right < rightArray.length) {
                if (leftArray[left] <= rightArray[right]) {
                    result[indexRs] = leftArray[left];
                    left++;
                } else {
                    result[indexRs] = rightArray[right];
                    right++;
                }
            } else {
                if (left < leftArray.length) {
                    result[indexRs] = leftArray[left];
                    left++;
                } else {
                    result[indexRs] = rightArray[right];
                    right++;
                }
            }
            indexRs++;
        }
        return result;
    }
}
