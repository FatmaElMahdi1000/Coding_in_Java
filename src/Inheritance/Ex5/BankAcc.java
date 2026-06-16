package Inheritance.Ex5;

public class BankAcc {

    protected double balance;
    public BankAcc()
    {
        this.balance = 20000; //constructor to initialize the balance, no need to pass it as parameter

    }
    public double withdrawAmount(double amount)
    {
        return this.balance-amount;
    }

}
