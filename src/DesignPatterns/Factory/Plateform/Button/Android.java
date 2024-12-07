package DesignPatterns.Factory.Plateform.Button;

public class Android implements Button {
    @Override
    public void click() {
        System.out.println("Android clicked");
    }
}
