package DesignPatterns.Strategy.Sorter;

public class DataProcessor {

    private SortingStrategy sortingStrategy;
    public DataProcessor(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void setSortingStrategy(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    void processData(int[] data){g
        if(sortingStrategy == null){
            setSortingStrategy(SortingStrategyFactory.getSortingStrategyBySize(data.length));
            sortingStrategy.sort(data);
        }
    }
}
