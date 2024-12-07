package DesignPatterns.Adapter.v1;

public class ICICIBankAPIAdapter implements BankAPI {

    ICICIBankAPI icicibankapi=new ICICIBankAPI();
    @Override
    public int balanceCheck(String accountNumber) {
        return icicibankapi.checkBalance(accountNumber);
    }
}
