package MidTermRevision.Classes;

public class BankAccount {
    //attributes
    static double balance = 5000;
    static public double add(double amount)
    {
        balance = balance + amount;
        return balance;
    }
    static public double substract(double amount)
    {
        balance = balance - amount;
        return balance;
    }
    double getBalance()
    {
        return balance;
    }

    public static void main(String[] args)
    {
        System.out.println(BankAccount.balance);
        System.out.println(BankAccount.add(500));
        System.out.println(BankAccount.substract(100));
        System.out.println(BankAccount.balance);

    }


}
