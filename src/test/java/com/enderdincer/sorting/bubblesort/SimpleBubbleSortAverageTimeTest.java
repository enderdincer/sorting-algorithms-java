package com.enderdincer.sorting.bubblesort;

import com.enderdincer.sorting.SortingAlgorithm;
import com.enderdincer.sorting.util.SortingTestHelper;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SimpleBubbleSortAverageTimeTest {

    SortingAlgorithm simpleBubbleSort = new SimpleBubbleSort();

    private static List<Integer> getRandomList(int size){
        return IntStream.range(0, size)
                .map(index -> (int) (Math.random() * 100))
                .boxed().collect(Collectors.toList());
    }

    @Test
    public void givenRandomIntegers() {
        final int listSize = 1_000;
        SortingTestHelper.measureAverageTime(() -> simpleBubbleSort.sort(getRandomList(listSize)), 100);
    }
}
