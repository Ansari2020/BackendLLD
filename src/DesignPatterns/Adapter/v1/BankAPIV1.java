package DesignPatterns.Adapter.v1;


public interface BankAPIV1 extends BankAPI{
    void setPIN(String PIN);
}

// interface can extend anotherInterface
