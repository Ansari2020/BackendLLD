package DesignPatterns.Adapter.v0;


public class Client {
    public static void main(String[] args) {
        PhonePe phonePe = new PhonePe();
        phonePe.rechargeFastTag(120);
        phonePe.availLoan(100);
    }
}


// Phone Pe : fast , loan