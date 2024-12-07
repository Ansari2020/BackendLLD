package DesignPatterns.Factory.Plateform.Button;

public class IOS implements Button {
    @Override
    public void click() {
        System.out.println("IOS");
    }
}
