package Inheritance.Ex6;

public class Secretary extends Emp{


    public Secretary(double Yearlysalary)
    {
        super(Yearlysalary);
    }

    @Override
    public double updateSalary()
    {
        return super.getYearlySalary() + 6000;
    }

}
