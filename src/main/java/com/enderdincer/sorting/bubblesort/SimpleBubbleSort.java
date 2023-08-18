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

    @Override
    public List<Integer> sort(List<Integer> integerList) {
        List<Integer> list = new ArrayList<>(integerList);

        for(int i=0; i<list.size(); i++){
            for(int j=0; j<list.size()-1; j++){
                if(list.get(j) > list.get(j+1)){
                    int temp = list.get(j+1);
                    list.set(j+1, list.get(j));
                    list.set(j, temp);
                }
            }
        }

        return list;
    }
}
