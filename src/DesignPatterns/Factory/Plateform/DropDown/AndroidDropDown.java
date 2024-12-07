package DesignPatterns.Factory.Plateform.DropDown;

public class AndroidDropDown implements DropDown {

    @Override
    public void getOptions() {
        System.out.println("Android DropDown");
    }
}
