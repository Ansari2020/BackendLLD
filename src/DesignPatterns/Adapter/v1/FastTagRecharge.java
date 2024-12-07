package DesignPatterns.Adapter.v1;



public class FastTagRecharge {

    public boolean recharge(BankAPI bankAPI, int amount){
        if(amount <= bankAPI.balanceCheck("")){
            System.out.println("Recharge is successful");
            return true;
        }
        return false;
    }
}
