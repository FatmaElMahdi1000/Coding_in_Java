package OOPLecture;

public class SavingsAccount
{

    static double annualInterestRate= 0.5;
    private double savingsBalance;

    SavingsAccount(double savingsBalance)
    {
        this.savingsBalance = savingsBalance;

    }
    public double calculateMonthlyInterest()
    {
        return savingsBalance*annualInterestRate;
    }
    public static void main(String args[])
    {
        SavingsAccount obj = new SavingsAccount(5000);
        obj.calculateMonthlyInterest();
        System.out.println(obj.calculateMonthlyInterest());
    }

}
