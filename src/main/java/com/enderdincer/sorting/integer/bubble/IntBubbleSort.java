package com.enderdincer.sorting.integer.bubble;

import com.enderdincer.sorting.integer.IntAbstractSort;

public class IntBubbleSort extends IntAbstractSort {

    @Override
    public int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j-1]) {
                    swap(array, j, j-1);
                }
            }
        }
        return array;
    }

    @Override
    public String getAlgorithmName() {
        return "Bubble Sort";
    }
}
