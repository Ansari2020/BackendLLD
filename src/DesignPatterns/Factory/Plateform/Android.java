package DesignPatterns.Factory.Plateform;

public class Android implements Plateform  {
    @Override
    public void setRefreshRate() {

    }

    @Override
    public void setTheme() {

    }

    @Override
    public UIComponentFactory createUIComponentFactory() {
        return new AndroidComponentFactory();
    }
}
