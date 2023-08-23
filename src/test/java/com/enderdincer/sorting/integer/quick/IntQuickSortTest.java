package com.enderdincer.sorting.integer.quick;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class IntQuickSortTest {

    @Test
    void quickSort() {
        final int[] given = new int[]{2, 3, 2, 6, 7, 8, 4, 2, 1};

        System.out.println("Given:  " + Arrays.toString(given));

        final var sorter = new IntQuickSort();

        final int[] sorted = sorter.sort(given);

        System.out.println("Sorted: " + Arrays.toString(sorted));

        assertThat(sorted).hasSize(given.length);
        assertThat(sorted).isSorted();
    }
}
