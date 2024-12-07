package DesignPatterns.Factory.Plateform;

import DesignPatterns.Factory.Plateform.Button.Button;
import DesignPatterns.Factory.Plateform.DropDown.DropDown;
import DesignPatterns.Factory.Plateform.Menu.Menu;

public interface Plateform {
    void setRefreshRate();
    void setTheme();

    UIComponentFactory createUIComponentFactory();

//    Button createButton();
//    DropDown createDropDown();
//    Menu createMenu();
}

