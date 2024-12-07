package DesignPatterns.Decorators.BevarageDecoder;

public class Mocha extends Addon{
    private BevarageDecoder decoder;

    public Mocha(BevarageDecoder decoder) {
        this.decoder = decoder;
    }
    @Override
    public double cost() {
        return 30+decoder.cost();
    }

    @Override
    public void getDescription() {
        decoder.getDescription();
        System.out.println("Added Mocha");
    }
}
