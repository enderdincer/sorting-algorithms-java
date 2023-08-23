package com.enderdincer.sorting.integer.insertion;

import com.enderdincer.sorting.integer.IntAbstractSort;

import java.util.Arrays;

public class IntInsertionSort extends IntAbstractSort {

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
        final int[] arrayCopy = Arrays.copyOf(array, array.length);

        for (int i = 1; i < arrayCopy.length; i++) {
            int j = i;
            while (j > 0 && arrayCopy[j - 1] > arrayCopy[j]) {
                swap(arrayCopy, j, j - 1);
                j--;
            }
        }

        return arrayCopy;
    }

    @Override
    public String getAlgorithmName() {
        return "Insertion Sort";
    }
}
