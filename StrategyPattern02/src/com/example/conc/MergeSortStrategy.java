package com.example.conc;

import com.example.abst.SortStrategy;

public class MergeSortStrategy implements SortStrategy {
    @Override
    public void sort(int[] data) {
        System.out.println("Sorting using MergeSort Strategy");
    }
}
