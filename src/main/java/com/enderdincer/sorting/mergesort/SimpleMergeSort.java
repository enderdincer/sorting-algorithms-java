package com.enderdincer.sorting.mergesort;

import com.enderdincer.sorting.SortingAlgorithm;

import java.util.List;

public class SimpleMergeSort implements SortingAlgorithm {

    private int[] merge(int[] left, int[] right) {
        int size = left.length + right.length;

        int[] merged = new int[size];

        int i = 0, j = 0, counter = 0;
        while (counter < size) {
            if (i >= left.length && j < right.length) {
                merged[counter] = right[j];
                j++;
            } else if (j >= right.length && i < left.length) {
                merged[counter] = left[i];
                i++;
            } else if (left[i] < right[j]) {
                merged[counter] = left[i];
                i++;
            } else {
                merged[counter] = right[j];
                j++;
            }
            counter++;
        }

        return merged;
    }

    @Override
    public int[] sort(int[] intArray) {
        int middleIndex = intArray.length / 2;
        int[] left = new int[middleIndex];

        for (int i = 0; i < middleIndex; i++) {
            left[i] = intArray[i];
        }

        int[] right = new int[intArray.length - middleIndex];

        for (int i = 0; i < intArray.length - middleIndex; i++) {
            right[i] = intArray[i + middleIndex];
        }

        int[] sortedLeft = left.length > 1 ? sort(left) : left;
        int[] sortedRight = right.length > 1 ? sort(right) : right;

        return merge(sortedLeft, sortedRight);
    }

    @Override
    public List<Integer> sort(List<Integer> list) {
        return null;
    }
}
