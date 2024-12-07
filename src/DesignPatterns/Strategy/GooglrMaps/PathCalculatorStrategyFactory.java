package DesignPatterns.Strategy.GooglrMaps;

public class PathCalculatorStrategyFactory {

    public static PathCalculatorStrategy getPathCalculatorStrategy(TravelMode mode ) {
        PathCalculatorStrategy pathCalculatorStrategy=null;
        if(mode.equals(TravelMode.CAR)){
            pathCalculatorStrategy=new CarPtahCalculatorStrategy();
        }
        else if(mode.equals(TravelMode.WALK)){
            pathCalculatorStrategy=new WalkPathCalculator();
        }
        else if(mode.equals(TravelMode.BIKE)){
            pathCalculatorStrategy=new BikePathCalculatorStrategy();
        }

        return pathCalculatorStrategy;
    }
}
