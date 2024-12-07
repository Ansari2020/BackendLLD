package DesignPatterns.Adapter.v1;

public class YesBankAPIAdapter implements  BankAPI{

    YesBankAPI yesBankAPI=new YesBankAPI();
    @Override
    public int balanceCheck(String accountNumber) {
        return yesBankAPI.getBalance(accountNumber);
    }
}
