package com.enderdincer.sorting.bubblesort;

import com.enderdincer.sorting.integer.IntegerSorter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SimpleBubbleSort implements IntegerSorter {

    @Override
    public int[] sort(int[] intArray) {
        int[] array = Arrays.copyOf(intArray,intArray.length);

        for(int i=0; i<array.length; i++){
            for(int j=0; j<array.length-1; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }

        return array;
    }
}
