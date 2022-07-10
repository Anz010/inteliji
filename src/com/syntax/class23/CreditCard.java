package com.syntax.class23;

public class CreditCard {
    double balance;
    double interest;

    public CreditCard(double balance, double interest){
        this.balance=balance;
        this.interest=interest;
    }

    public void calculateInterest(){
        System.out.println("Interest "+(balance*interest/100));
    }

}
class Visa extends CreditCard{
    Visa (double balance, double interest){
        super(balance, interest);
    }
}
class AX extends CreditCard{
    public AX(double balance, double interest){
        super (balance, interest);
    }
}
