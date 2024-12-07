package DesignPatterns.Strategy.Sorter;

public class SortingStrategyFactory {

    //SortingStrategy sortingStrategy;

    public static SortingStrategy getSortingStrategyBySize(Integer size) {
        SortingStrategy sortingStrategy=null;
        if(size>=10){
            sortingStrategy=new QuickSort();
        }
        else if(size>=5){
            sortingStrategy=new HeapSort();
        }
        else if(size>=4){
            sortingStrategy=new MergeSort();
        }
        return sortingStrategy;


    }
}
