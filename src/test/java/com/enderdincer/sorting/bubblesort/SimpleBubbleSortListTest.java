package com.enderdincer.sorting.bubblesort;

import com.enderdincer.sorting.SortingAlgorithm;
import com.enderdincer.sorting.util.SortingTestHelper;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SimpleBubbleSortListTest {

    SortingAlgorithm simpleBubbleSort = new SimpleBubbleSort();

    @Test
    public void given100000RandomIntegers() {
        final List<Integer> givenList = IntStream.range(0, 100_000)
                .map(index -> (int) (Math.random() * 100))
                .boxed().collect(Collectors.toList());
        final List<Integer> expectedList = givenList.stream().sorted().collect(Collectors.toList());

        final List<Integer> actualList = SortingTestHelper.measureTimeAndReturnResult(() -> simpleBubbleSort.sort(givenList));

        Assertions.assertThat(actualList).isEqualTo(expectedList);
    }

    @Test
    public void given10000RandomIntegers() {
        final List<Integer> givenList = IntStream.range(0, 10_000)
                .map(index -> (int) (Math.random() * 100))
                .boxed().collect(Collectors.toList());
        final List<Integer> expectedList = givenList.stream().sorted().collect(Collectors.toList());

        final List<Integer> actualList = SortingTestHelper.measureTimeAndReturnResult(() -> simpleBubbleSort.sort(givenList));

        Assertions.assertThat(actualList).isEqualTo(expectedList);
    }

    @Test
    public void givenArrayNotSorted() {
        final List<Integer> givenList = List.of(2, 1, 3, 6, 5, 6, 7, 4);
        final List<Integer> expectedList = List.of(1, 2, 3, 4, 5, 6, 6, 7);

        final List<Integer> actualList = simpleBubbleSort.sort(givenList);

        Assertions.assertThat(actualList).isEqualTo(expectedList);
    }

    @Test
    public void givenArrayIsWorstCase() {
        final List<Integer> givenList = List.of(7, 6, 5, 4, 3, 2, 1);
        final List<Integer> expectedList = List.of(1, 2, 3, 4, 5, 6, 7);

        final List<Integer> actualList = simpleBubbleSort.sort(givenList);

        Assertions.assertThat(actualList).isEqualTo(expectedList);
    }

    @Test
    public void givenArrayIsSorted() {
        final List<Integer> givenList = List.of(1, 2, 3, 4, 5, 6, 7);
        final List<Integer> expectedList = List.of(1, 2, 3, 4, 5, 6, 7);

        final List<Integer> actualList = simpleBubbleSort.sort(givenList);

        Assertions.assertThat(actualList).isEqualTo(expectedList);
    }
}
