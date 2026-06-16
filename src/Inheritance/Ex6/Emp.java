package Inheritance.Ex6;

public abstract class Emp {
    private double Yearlysalary;

    //concrete constructor but cannot make an instance or object from it, can inherit only by super()
    Emp(double Yearlysalary)
    {
        this.Yearlysalary = Yearlysalary;
    }
    //Nobody
    public abstract double updateSalary();

    public double getYearlySalary()
    {
        return this.Yearlysalary;

    }

}
