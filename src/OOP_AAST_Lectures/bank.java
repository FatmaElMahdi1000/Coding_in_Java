package Student;

public class bank {

    static double balance ;
    void setBalance(double balance)
    {
        this.balance = balance;
    }
    double getBalance()
    {
        return balance;
    }
    void withdrawBalance(double amount)
    {
        if (amount <= balance)
        {
            balance = balance - amount;
            System.out.println("Done! ");
        }
        else
        {
            System.out.println("Insufficient amount! ");

        }

    }

    void depositedAmount(double amount)
    {
        balance = balance + amount;
    }

    public static void main(String[] args )
    {
        bank operation1 = new bank();
        bank.balance = 100;
        operation1.withdrawBalance(50);
        operation1.depositedAmount(200);
        System.out.println(balance);

    }

}
