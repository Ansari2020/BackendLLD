package DesignPatterns.Factory.Plateform;

public class PlateformFactory {

    public static Plateform getPlateformByName(String plateformName) {
        if (plateformName.equals("Android")) {
            return new Android();
        } else if (plateformName.equals("IOS")) {
            return new IOS();
        }
        return null;

    }
}
