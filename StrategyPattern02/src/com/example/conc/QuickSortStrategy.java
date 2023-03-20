package com.example.conc;

import com.example.abst.SortStrategy;

public class QuickSortStrategy implements SortStrategy {
    @Override
    public void sort(int[] data) {
        System.out.println("Sorting using QuickSort Strategy");
    }
}
