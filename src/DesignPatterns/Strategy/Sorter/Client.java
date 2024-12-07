package DesignPatterns.Strategy.Sorter;

public class Client {
    public static void main(String[] args) {

        DataProcessor dataProcessor=new DataProcessor(null);
        int[] data=new int[12];

        dataProcessor.processData(data);
    }
}
