package DesignPatterns.Factory.Plateform;

import DesignPatterns.Factory.Plateform.Button.Android;
import DesignPatterns.Factory.Plateform.Button.Button;
import DesignPatterns.Factory.Plateform.Button.IOS;
import DesignPatterns.Factory.Plateform.DropDown.AndroidDropDown;
import DesignPatterns.Factory.Plateform.DropDown.DropDown;
import DesignPatterns.Factory.Plateform.DropDown.IOSDropDown;
import DesignPatterns.Factory.Plateform.Menu.AndroidMenu;
import DesignPatterns.Factory.Plateform.Menu.IOSMenu;
import DesignPatterns.Factory.Plateform.Menu.Menu;

public class IOSUIComponentFactory implements UIComponentFactory {


    @Override
    public Button createButton() {
        return new IOS();
    }

    @Override
    public DropDown createDropDown() {
        return new IOSDropDown();
    }

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }
}
