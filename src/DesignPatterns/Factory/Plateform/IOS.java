package DesignPatterns.Factory.Plateform;

public class IOS implements Plateform {
    @Override
    public void setRefreshRate() {

    }

    @Override
    public void setTheme() {

    }

    @Override
    public UIComponentFactory createUIComponentFactory() {
        return new IOSUIComponentFactory();
    }
}
