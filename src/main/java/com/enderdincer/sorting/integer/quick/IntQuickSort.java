package com.enderdincer.sorting.integer.quick;

import com.enderdincer.sorting.integer.AbstractIntSort;

public class IntQuickSort extends AbstractIntSort {

    @Override
    public int[] sort(int[] array) {
        return quickSort(array, 0, array.length-1);
    }

    private int[] quickSort(int[] array, int start, int end) {
        if (end - start <= 0) {
            return array;
        }

        int pivot = array[end];
        int count = start-1;

        for (int i = start; i < end; i++) {
            if (pivot >= array[i]) {
                count++;

                if (i - count > 0) {
                    swap(array, i, count);
                }
            }
        }

        swap(array, count+1, end);

        quickSort(array, start, count);
        quickSort(array, count+2, end);

        return array;
    }

    @Override
    public String getAlgorithmName() {
        return "Quick Sort";
    }
}
