package LLD3.MachineCoding1DesignPen;

public abstract class Pen {
    String name;
    String brand;
    int price;

    PenType penType;
    CloseType closeType;

    public abstract void write();
    public abstract void open();
    public abstract void close();
}
