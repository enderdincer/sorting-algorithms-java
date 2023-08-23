package com.enderdincer.sorting.integer.merge;

import com.enderdincer.sorting.integer.IntSort;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class IntMergeSortTest {

    private final IntSort mergeSort = new IntMergeSort();

    @Test
    void mergeSort() {
        final int[] given = new int[]{2, 3, 2, 6, 7, 8, 4, 2, 1};

        System.out.println("Given:  " + Arrays.toString(given));

        final int[] sorted = mergeSort.sort(given);

        System.out.println("Sorted: " + Arrays.toString(sorted));

        assertThat(sorted).hasSize(given.length);
        assertThat(sorted).isSorted();
    }
}
