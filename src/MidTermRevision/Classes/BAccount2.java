package MidTermRevision.Classes;
public class BAccount2 {
    static double balance;

    void setBalance(double balance)
    {
        this.balance = balance;
    }
    double getBalance()
    {
        return balance;
    }

    double withdraw(double amount)
    {
        if(amount <= balance)
        {
            balance = balance - amount;
        }
        else
        {
            System.err.println("Failure! No Sufficient amount to withdraw!");
        }
        return balance;
    }

    double add(double amount)
    {
        balance = balance + amount;
        return balance;
    }

    public static void main(String[] args)
    {
        BAccount2 Operation1 = new BAccount2();
        Operation1.setBalance(5000);
        Operation1.withdraw(400);
        System.out.println(Operation1.getBalance());
        Operation1.add(500);
        Operation1.add(700);
        System.out.println(Operation1.getBalance());
    }

}
