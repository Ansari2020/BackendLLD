package DesignPatterns.Strategy.Sorter;

public class QuickSort implements SortingStrategy{

    @Override
    public void sort(int[] data) {
        System.out.println("QuickSort is called");
    }
}
