package DesignPatterns.Adapter.v1;

public class BankAPIAdapterFactory {
    public static BankAPI getBankAPI(String bankName) {
        BankAPI bankAPI = null;
        switch (bankName) {
            case "ICICI": return new ICICIBankAPIAdapter();
            case "YesBank": return new YesBankAPIAdapter();
        }
        return bankAPI;
    }
}
