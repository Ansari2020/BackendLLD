package DesignPatterns.Decorators.BevarageDecoder;

public class Client {
    public static void main(String[] args) {

        BevarageDecoder bevarageDecoder=new Espresso();
        bevarageDecoder.getDescription();
        System.out.println( bevarageDecoder.cost());

        bevarageDecoder=new Whip(bevarageDecoder);
        bevarageDecoder=new Milk(bevarageDecoder);
        bevarageDecoder=new Mocha(bevarageDecoder);
        bevarageDecoder.getDescription();
        System.out.println( bevarageDecoder.cost());
    }
}
