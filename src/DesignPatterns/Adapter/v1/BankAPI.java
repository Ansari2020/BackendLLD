package DesignPatterns.Adapter.v1;


public interface BankAPI {
    int balanceCheck(String accountNumber);

//    void transfer(String fromAccount, String toAccount, double amount);
}

// Whoever wants to be a UPI provider
