package DesignPatterns.Factory.Plateform;

import DesignPatterns.Factory.Plateform.Button.Android;
import DesignPatterns.Factory.Plateform.Button.Button;
import DesignPatterns.Factory.Plateform.DropDown.AndroidDropDown;
import DesignPatterns.Factory.Plateform.DropDown.DropDown;
import DesignPatterns.Factory.Plateform.Menu.AndroidMenu;
import DesignPatterns.Factory.Plateform.Menu.Menu;

public class AndroidComponentFactory implements UIComponentFactory {
    @Override
    public Button createButton() {
        return new Android();
    }

    @Override
    public DropDown createDropDown() {
        return new AndroidDropDown();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }
}
