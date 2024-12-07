package LLD3.MachineCoding1DesignPen;

public class GelPen extends Pen implements Refillable{
    @Override
    public void write() {
        System.out.println("Write GelPen");
    }

    @Override
    public void open() {
        System.out.println("Open GelPen");
    }

    @Override
    public void close() {
        System.out.println("Close GelPen");
    }

    @Override
    public void refill() {
        System.out.println("Refill GelPen");
    }
}
