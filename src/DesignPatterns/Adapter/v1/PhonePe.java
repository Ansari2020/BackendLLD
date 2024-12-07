package DesignPatterns.Adapter.v1;

import DesignPatterns.Adapter.v1.BankAPI;

public class PhonePe {
    private BankAPI bankAPI;
    private FastTagRecharge fastTagRecharge;
    private PhonePeLoan phonePeLoan;

    PhonePe(BankAPI bankAPI){
//        yesBankAPI = new YesBankAPI();
        this.bankAPI = bankAPI;
        fastTagRecharge = new FastTagRecharge();
        phonePeLoan = new PhonePeLoan();
    }

    boolean rechargeFastTag(int amount){
        return fastTagRecharge.recharge(bankAPI , amount);
    }

    boolean availLoan(int amount){
        return phonePeLoan.checkEligibility(bankAPI , amount);
    }
}
