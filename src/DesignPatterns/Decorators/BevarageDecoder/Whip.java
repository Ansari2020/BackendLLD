package DesignPatterns.Decorators.BevarageDecoder;

public class Whip extends Addon{

    private BevarageDecoder decoder;
    public Whip(BevarageDecoder decoder) {
        this.decoder = decoder;
    }
    @Override
    public double cost() {
        return 10+decoder.cost();
    }

    @Override
    public void getDescription() {
        decoder.getDescription();
        System.out.println("Added Whip");

    }
}
