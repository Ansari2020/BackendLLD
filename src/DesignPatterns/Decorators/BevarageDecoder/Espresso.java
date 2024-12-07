package DesignPatterns.Decorators.BevarageDecoder;

public class Espresso extends BevarageDecoder{
    @Override
    public double cost() {
        return 100.0;
    }

    @Override
    public void getDescription() {
        System.out.println("Espresso");
    }
}
