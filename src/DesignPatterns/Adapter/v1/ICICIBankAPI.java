package DesignPatterns.Adapter.v1;



public class ICICIBankAPI {

    public int checkBalance(String account){
        System.out.println("getting balance via ICICI");
        return 100;
    }
}

// We can use Interface as a type
// Animal x = new Dog();
// Interface y = new ClasswhichImplementsThisInterface;

// BankAPI x = new YesBank();