package DesignPatterns.Strategy.GooglrMaps;

public class CarPtahCalculatorStrategy implements PathCalculatorStrategy{

    @Override
    public void findPath(String src, String dest) {
        System.out.println("Car Path calculator");
    }
}
