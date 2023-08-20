//package com.enderdincer.sorting.mergesort;
//
//import com.enderdincer.sorting.integer.IntegerSorter;
//import com.enderdincer.sorting.util.SortingTestHelper;
//import org.assertj.core.api.Assertions;
//import org.junit.jupiter.api.Test;
//
//import java.util.Arrays;
//import java.util.stream.IntStream;
//
//public class SimpleMergeSortTest {
//
//    IntegerSorter simpleMergeSort = new SimpleMergeSort();
//
//    @Test
//    public void given100_000RandomIntegers() {
//        final int[] givenArray = IntStream.range(0, 100_000).map(index -> (int) (Math.random() * 1000)).toArray();
//        int[] expectedArray = Arrays.copyOf(givenArray, givenArray.length);
//        Arrays.sort(expectedArray);
//
//        final int[] actualArray = SortingTestHelper.measureTimeAndReturnResult(() -> simpleMergeSort.sort(givenArray));
//
//        Assertions.assertThat(actualArray).isEqualTo(expectedArray);
//    }
//
//    @Test
//    public void given10000RandomIntegers() {
//        final int[] givenArray = IntStream.range(0, 10_000).map(index -> (int) (Math.random() * 100)).toArray();
//        int[] expectedArray = Arrays.copyOf(givenArray, givenArray.length);
//        Arrays.sort(expectedArray);
//
//        final int[] actualArray = SortingTestHelper.measureTimeAndReturnResult(() -> simpleMergeSort.sort(givenArray));
//
//        Assertions.assertThat(actualArray).isEqualTo(expectedArray);
//    }
//
//    @Test
//    public void givenArrayNotSorted() {
//        final int[] givenArray = {2, 1, 3, 6, 5, 6, 7, 4};
//        final int[] expectedArray = {1, 2, 3, 4, 5, 6, 6, 7};
//
//        final int[] actualArray = simpleMergeSort.sort(givenArray);
//
//        Assertions.assertThat(actualArray).isEqualTo(expectedArray);
//    }
//
//    @Test
//    public void givenArrayIsWorstCase() {
//        final int[] givenArray = {7, 6, 5, 4, 3, 2, 1};
//        final int[] expectedArray = {1, 2, 3, 4, 5, 6, 7};
//
//        final int[] actualArray = simpleMergeSort.sort(givenArray);
//
//        Assertions.assertThat(actualArray).isEqualTo(expectedArray);
//    }
//
//    @Test
//    public void givenArrayIsSorted() {
//        final int[] givenArray = {1, 2, 3, 4, 5, 6, 7};
//        final int[] expectedArray = {1, 2, 3, 4, 5, 6, 7};
//
//        final int[] actualArray = simpleMergeSort.sort(givenArray);
//
//        Assertions.assertThat(actualArray).isEqualTo(expectedArray);
//    }
//
//    @Test
//    public void givenArrayIsSingleElement() {
//        final int[] givenArray = {3};
//        final int[] expectedArray = {3};
//
//        final int[] actualArray = simpleMergeSort.sort(givenArray);
//
//        Assertions.assertThat(actualArray).isEqualTo(expectedArray);
//    }
//}
