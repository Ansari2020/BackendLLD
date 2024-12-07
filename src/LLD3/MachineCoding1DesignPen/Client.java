package LLD3.MachineCoding1DesignPen;

public class Client {
    public static void main(String[] args) {

        PenType penType;
        CloseType closeType;

        BallPen ballPen = new BallPen();
        ballPen.brand="elkos";
        ballPen.penType=PenType.GelPen;
        ballPen.closeType=CloseType.Cap;
        ballPen.write();
        ballPen.refill();

        System.out.println(ballPen.penType);
    }
}
