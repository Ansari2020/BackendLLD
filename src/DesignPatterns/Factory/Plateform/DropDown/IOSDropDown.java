package DesignPatterns.Factory.Plateform.DropDown;

public class IOSDropDown implements DropDown {
    @Override
    public void getOptions() {
        System.out.println("IOS dropdown");
    }
}
