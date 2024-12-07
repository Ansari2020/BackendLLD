package LLD3.MachineCoding1DesignPen;

public class BallPen extends Pen implements Refillable{
    @Override
    public void write() {
        System.out.println("Write Ball Pen");
    }

    @Override
    public void open() {
        System.out.println("Open Ball Pen");
    }

    @Override
    public void close() {
        System.out.println("Close Ball Pen");
    }

    @Override
    public void refill() {
        System.out.println("Refill Ball Pen");
    }
}
