package DesignPatterns.Adapter.v1;

public class YesBankAPI{

    public int getBalance(String account) {
        System.out.println("Getting Balance via YesBank");
        return 100;
    }

}
