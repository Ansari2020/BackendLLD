package DesignPatterns.Strategy.GooglrMaps;

public class BikePathCalculatorStrategy implements PathCalculatorStrategy {

    @Override
    public void findPath(String src, String dest) {
        System.out.println("Bike Path calculator");
    }
}
