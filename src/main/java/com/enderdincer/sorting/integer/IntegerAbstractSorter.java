package com.enderdincer.sorting.integer;

public abstract class IntegerAbstractSorter implements IntegerSorter {

    protected void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
