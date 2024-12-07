package DesignPatterns.Decorators.BevarageDecoder;

public class Milk extends Addon{

    private BevarageDecoder decoder;

    public Milk(BevarageDecoder decoder) {
        this.decoder = decoder;
    }
    @Override
    public double cost() {
        return 20+decoder.cost();
    }

    @Override
    public void getDescription() {
        decoder.getDescription();
        System.out.println("Added Milk");
    }
}
