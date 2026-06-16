package Inheritance.Ex4;

public class Manager extends Employee{

    private double bonus;
                 //Base Salary from Manager
    public Manager(double bonus)
    {
        super();
        this.bonus = bonus;
    }
    @Override
    public double calculatePay()
    {
        return super.calculatePay() + this.bonus;
    }
    public static void main(String[] args)
    {
        Manager mg1 = new Manager(5000);
        System.out.println(mg1.calculatePay());

    }

}
