package com.enderdincer.sorting.integer.insertion;

import com.enderdincer.sorting.integer.IntegerSorter;

import java.util.Arrays;
import java.util.List;

public class IntegerInsertionSorter implements IntegerSorter {


    @Override
    public int[] sort(int[] array) {
        final int[] sorted = new int[array.length];
        sorted[0] = array[0];

        for (int i = 1; i < array.length; i++) {
            System.out.println(i);
            if (sorted[i - 1] <= array[i]) {
                sorted[i] = array[i];
            } else {
                int j = i;

                while (sorted[j-1] > array[i]) {
                    sorted[j] = sorted[j-1];

                    if(j<=1) {
                        sorted[0] = array[i];
                        break;
                    }

                    j--;
                }

                if(sorted[j-1] <= array[i] && j-1 != 0) {
                    sorted[j] = array[i];
                }
            }
        }

        return sorted;
    }

    @Override
    public List<Integer> sort(List<Integer> list) {
        return null;
    }
}
