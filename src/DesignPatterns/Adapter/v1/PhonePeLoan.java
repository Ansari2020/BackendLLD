package DesignPatterns.Adapter.v1;

import DesignPatterns.Adapter.v1.BankAPI;

public class PhonePeLoan {
    boolean checkEligibility(BankAPI bankAPI , int amount){
        if(bankAPI.balanceCheck("") >= .2 * amount){
            System.out.println("Loan can be taken");
            return true;
        }
        return false;
    }
}
