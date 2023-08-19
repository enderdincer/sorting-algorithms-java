package com.enderdincer.sorting.bubblesort;

import com.enderdincer.sorting.integer.IntegerSorter;
import com.enderdincer.sorting.util.SortingTestHelper;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SimpleBubbleSortAverageTimeTest {

    IntegerSorter simpleBubbleSort = new SimpleBubbleSort();

    private static List<Integer> getRandomList(int size){
        return IntStream.range(0, size)
                .map(index -> (int) (Math.random() * 100))
                .boxed().collect(Collectors.toList());
    }
}
