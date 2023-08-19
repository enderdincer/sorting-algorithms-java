package com.enderdincer.sorting.integer.insertion;

import com.enderdincer.sorting.integer.IntegerSorter;

import java.util.Arrays;
import java.util.List;

public class IntegerInsertionSorter implements IntegerSorter {


    @Override
    public int[] sort(int[] array) {
        return impl2(array);
    }

    // Common implementation
    private int[] impl2(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int j = i;
            while (j > 0 && array[j - 1] > array[j]) {
                swap(array, j, j - 1);
                j--;
            }
        }
        return array;
    }

    // Pure function
    // Does not modify the given array
    private int[] impl1(int[] array) {
        final int[] sorted = new int[array.length];
        sorted[0] = array[0];

        for (int i = 1; i < array.length; i++) {
            System.out.println(i);
            if (sorted[i - 1] <= array[i]) {
                sorted[i] = array[i];
            } else {
                int j = i;

                while (sorted[j - 1] > array[i]) {
                    sorted[j] = sorted[j - 1];

                    if (j <= 1) {
                        sorted[0] = array[i];
                        break;
                    }

                    j--;
                }

                if (sorted[j - 1] <= array[i] && j - 1 != 0) {
                    sorted[j] = array[i];
                }
            }
        }

        return sorted;
    }

    private void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
