package Inheritance.Ex6;


public class Lawyer extends Emp{

    Lawyer(double Yearlysalary)
    {
        super(Yearlysalary);
    }
    @Override
    public double updateSalary()
    {
        return super.getYearlySalary() + 5000;
    }
    public static void main(String[] args)
    {
        Lawyer l1 = new Lawyer(4000);
        System.out.println(l1.updateSalary());

        Secretary S1 = new Secretary(4000);
        System.out.println(S1.updateSalary());
    }

}
