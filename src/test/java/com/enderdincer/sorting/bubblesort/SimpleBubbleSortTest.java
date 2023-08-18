package com.enderdincer.sorting.bubblesort;

import com.enderdincer.sorting.integer.IntegerSorter;
import com.enderdincer.sorting.util.SortingTestHelper;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SimpleBubbleSortTest {

    IntegerSorter simpleBubbleSort = new SimpleBubbleSort();

    @Test
    public void given100000RandomIntegers() {
        final int[] givenArray = IntStream.range(0, 100_000).map(index -> (int) (Math.random() * 100)).toArray();
        int[] expectedArray = Arrays.copyOf(givenArray, givenArray.length);
        Arrays.sort(expectedArray);

        final int[] actualArray = SortingTestHelper.measureTimeAndReturnResult(() -> simpleBubbleSort.sort(givenArray));

        Assertions.assertThat(actualArray).isEqualTo(expectedArray);
    }

    @Test
    public void given10000RandomIntegers() {
        final int[] givenArray = IntStream.range(0, 10_000).map(index -> (int) (Math.random() * 100)).toArray();
        int[] expectedArray = Arrays.copyOf(givenArray, givenArray.length);
        Arrays.sort(expectedArray);

        final int[] actualArray = SortingTestHelper.measureTimeAndReturnResult(() -> simpleBubbleSort.sort(givenArray));

        Assertions.assertThat(actualArray).isEqualTo(expectedArray);
    }

    @Test
    public void givenArrayNotSorted() {
        final int[] givenArray = {2, 1, 3, 6, 5, 6, 7, 4};
        final int[] expectedArray = {1, 2, 3, 4, 5, 6, 6, 7};

        final int[] actualArray = simpleBubbleSort.sort(givenArray);

        Assertions.assertThat(actualArray).isEqualTo(expectedArray);
    }

    @Test
    public void givenArrayIsSorted() {
        final int[] givenArray = {1, 2, 3, 4, 5, 6, 7};
        final int[] expectedArray = {1, 2, 3, 4, 5, 6, 7};

        final int[] actualArray = simpleBubbleSort.sort(givenArray);

        Assertions.assertThat(actualArray).isEqualTo(expectedArray);
    }
}
