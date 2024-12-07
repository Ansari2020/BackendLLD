package DesignPatterns.Factory.Plateform;

import DesignPatterns.Factory.Plateform.Button.Button;
import DesignPatterns.Factory.Plateform.DropDown.DropDown;
import DesignPatterns.Factory.Plateform.Menu.Menu;

public interface UIComponentFactory {
    Button createButton();
    DropDown createDropDown();
    Menu createMenu();
}
