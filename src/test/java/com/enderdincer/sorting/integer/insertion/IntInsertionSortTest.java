package com.enderdincer.sorting.integer.insertion;

import com.enderdincer.sorting.integer.IntSort;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class IntInsertionSortTest {

    private final IntSort insertionSort = new InsertionIntSort();

    @Test
    void mergeSort() {
        final int[] given = new int[]{2, 3, 2, 6, 7, 8, 4, 2, 1};

        System.out.println("Given:  " + Arrays.toString(given));

        final int[] sorted = insertionSort.sort(given);

        System.out.println("Sorted: " + Arrays.toString(sorted));

        assertThat(sorted).hasSize(given.length);
        assertThat(sorted).isSorted();
    }
}

