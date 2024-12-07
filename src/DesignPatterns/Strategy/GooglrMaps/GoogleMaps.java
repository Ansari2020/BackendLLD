package DesignPatterns.Strategy.GooglrMaps;

public class GoogleMaps {
    void findpath(String src, String dest, TravelMode mode) {
//        if(mode.equals(TravelMode.CAR)){
//            System.out.println("Car mode is calculated");
//        }
//        else if(mode.equals(TravelMode.WALK)){
//            System.out.println("Walk mode is calculated");
//        }
//        else if(mode.equals(TravelMode.BIKE)){
//            System.out.println("Bike mode is calculated");
//        }

        //PathCalculatorStrategy pathCalculatorStrategy=null;
//
//        if(mode.equals(TravelMode.CAR)){
//            pathCalculatorStrategy=new CarPtahCalculatorStrategy();
//        }
//        else if(mode.equals(TravelMode.WALK)){
//            pathCalculatorStrategy=new WalkPathCalculator();
//        }
//        else if(mode.equals(TravelMode.BIKE)){
//            pathCalculatorStrategy=new BikePathCalculatorStrategy();
//        }

        PathCalculatorStrategyFactory.
                getPathCalculatorStrategy(mode)
                .findPath(src,dest);

    }
}
