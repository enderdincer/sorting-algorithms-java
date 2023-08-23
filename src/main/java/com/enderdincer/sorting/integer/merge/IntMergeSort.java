package com.enderdincer.sorting.integer.merge;

import com.enderdincer.sorting.integer.IntAbstractSort;

import java.util.Arrays;

public class IntMergeSort extends IntAbstractSort {

    @Override
    public int[] sort(int[] array) {
        if (array.length < 2) {
            return array;
        }

        int mid = array.length / 2;

        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, array.length);

        int[] sortedLeft = sort(left);
        int[] sortedRight = sort(right);

        return merge(sortedLeft, sortedRight);
    }

    private int[] merge(int[] left, int[] right) {
        final int leftLength = left.length;
        final int rightLength = right.length;

        int[] merged = new int[leftLength + rightLength];

        int li = 0;
        int ri = 0;

        while (li < leftLength && ri < rightLength) {
            if (left[li] <= right[ri]) {
                merged[li + ri] = left[li];
                li++;
            } else {
                merged[li + ri] = right[ri];
                ri++;
            }
        }

        while (li < leftLength) {
            merged[li + ri] = left[li];
            li++;
        }

        while (ri < rightLength) {
            merged[li + ri] = right[ri];
            ri++;
        }

        return merged;
    }

    @Override
    public String getAlgorithmName() {
        return "Merge Sort";
    }
}
