package AbstractPrinciple.Ex1;

public class circle extends shape{

    private double radius;// 1. HIDE: No one outside this class can see 'radius'
    public circle(double radius)
    {
        setRadius(radius);
    }

    public void setRadius(double radius)
    {
        if(radius <1)
        {
            throw new IllegalArgumentException("Invalid value");
        }
        else {
            this.radius = radius;
        }
    }
    public double getRadius()
    {
        return this.radius;
    }

    @Override
    double area() {
        return Math.PI * Math.pow(radius, 2);
    }

}
