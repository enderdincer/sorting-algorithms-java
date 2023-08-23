package com.enderdincer.sorting.integer.bubble;

import com.enderdincer.sorting.integer.IntSort;
import com.enderdincer.sorting.integer.merge.IntMergeSort;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class IntBubbleSortTest {
    private final IntSort bubbleSort = new IntBubbleSort();

    @Test
    void mergeSort() {
        final int[] given = new int[]{2, 3, 2, 6, 7, 8, 4, 2, 1};

        System.out.println("Given:  " + Arrays.toString(given));

        final int[] sorted = bubbleSort.sort(given);

        System.out.println("Sorted: " + Arrays.toString(sorted));

        assertThat(sorted).hasSize(given.length);
        assertThat(sorted).isSorted();
    }
}
