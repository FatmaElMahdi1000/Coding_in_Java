package Interface.EX4;

public class Transaction implements Loggable {

    private int transactionId;
    private double amount;

    Transaction(int transactionId, double amount)
    {
        this.transactionId = transactionId;
        this.amount = amount;
    }
    @Override
    public String ConvertToText()
    {
       return  "Txn ID: " + this.transactionId + " Amount: " + this.amount;
    }

    public static void main(String[] args)
    {
        Transaction trs = new Transaction(1000,422);
        System.out.println(trs.ConvertToText());
        User Usr = new User("Fatmaelmahdi@yahoo.com", "Fatma");
        System.out.println(Usr.ConvertToText());

    }
}
