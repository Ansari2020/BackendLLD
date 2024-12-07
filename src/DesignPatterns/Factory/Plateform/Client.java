package DesignPatterns.Factory.Plateform;

import DesignPatterns.Factory.Plateform.Button.Android;
import DesignPatterns.Factory.Plateform.Button.Button;
import DesignPatterns.Factory.Plateform.DropDown.DropDown;
import DesignPatterns.Factory.Plateform.Menu.Menu;

import java.util.Scanner;

public class Client {
    private static Scanner scanner = new Scanner(System.in);
    public static Plateform getPlateform() {
        return null;
    }
    public static void main(String[] args) {
        String plateformName = scanner.nextLine();

        Plateform plateform = PlateformFactory.getPlateformByName(plateformName);
//        Button b;
//        if(plateform instanceof Button) {
//            b=new Android();
//        }
        UIComponentFactory uiComponentFactory= plateform.createUIComponentFactory();
        Button b=uiComponentFactory.createButton();
        b.click();
        DropDown d=uiComponentFactory.createDropDown();
        d.getOptions();
        Menu m=uiComponentFactory.createMenu();
        m.takeScreenShot();


    }
}
