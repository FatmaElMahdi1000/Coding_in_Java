package Inheritance.Ex5;

public class SavingAcc extends BankAcc {

    final double  TRANSFEE = 5.0;

    public SavingAcc()
    {
        super();
    }
    @Override
    public double withdrawAmount(double amount)
    {
        return super.withdrawAmount(amount) - this.TRANSFEE;
    }

    public static void main(String[] args)
    {
        BankAcc B = new BankAcc();
        SavingAcc S = new SavingAcc();
        System.out.println(S.withdrawAmount(5000));

    }

}
