package com.enderdincer.sorting.integer.bubble;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class IntegerBubbleSorterTest {

    @Test
    void test() {
        final int[] given = new int[]{2, 3, 2, 6, 7, 8, 4, 2, 1};
        System.out.println("Given:  "+ Arrays.toString(given));

        final var sorter = new IntegerBubbleSorter();

        final int[] sorted = sorter.sort(given);

        System.out.println("Sorted: "+Arrays.toString(sorted));
    }
}
