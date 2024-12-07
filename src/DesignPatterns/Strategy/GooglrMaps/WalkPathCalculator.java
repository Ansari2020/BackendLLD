package DesignPatterns.Strategy.GooglrMaps;

public class WalkPathCalculator implements PathCalculatorStrategy{

    @Override
    public void findPath(String src, String dest) {
        System.out.println("Walk path calculator ");
    }
}
