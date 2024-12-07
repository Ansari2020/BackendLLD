package DesignPatterns.Factory.Plateform.Menu;

public class IOSMenu implements Menu {
    @Override
    public void takeScreenShot() {
        System.out.println("Taking Screen Shot in IOS Menu");
    }
}
