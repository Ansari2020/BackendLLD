package DesignPatterns.Decorators.BevarageDecoder;

public class HouseBlend extends BevarageDecoder{
    @Override
    public double cost() {
        return 200.0;
    }

    @Override
    public void getDescription() {
        System.out.println("House Blend");
    }
}
