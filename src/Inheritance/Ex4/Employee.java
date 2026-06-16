package Inheritance.Ex4;

public class Employee {
    private double baseSalary;

    public Employee()
    {
        this.baseSalary = 3000;
    }

    public double calculatePay()
    {
        return this.baseSalary;
    }
}
