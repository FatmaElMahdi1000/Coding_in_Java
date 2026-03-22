package AbstractPrinciple.Ex1;

public class Triangle extends shape{
    //attributes/ states
    double base;
    double height;
    //constructor
    Triangle(double base, double height)
    {
        this.base = base;
        this.height = height;
    }
    //methods/behaviour
    @Override
    double area() {
        return (height * base) /2.0;
    }
}
