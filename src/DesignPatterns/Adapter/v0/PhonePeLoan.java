package DesignPatterns.Adapter.v0;


public class PhonePeLoan {
    boolean checkEligibility(YesBankAPI yesBankAPI , int amount){
        if(yesBankAPI.getBalance("") >= .2 * amount){
            System.out.println("Loan can be taken");
            return true;
        }
        return false;
    }
}
