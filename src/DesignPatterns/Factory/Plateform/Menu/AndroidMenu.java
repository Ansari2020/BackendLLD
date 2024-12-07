package DesignPatterns.Factory.Plateform.Menu;

public class AndroidMenu implements Menu {
    @Override
    public void takeScreenShot() {
        System.out.println("Taking Screen Shot in Android");
    }
}
