package OOP;

public class Circle {
    //attributes
     double radius;
    //since radius in the class no need to pass it to any method inside the class
    public double area()
    {
        return Math.PI * Math.pow(radius, 2);
    }

    public double perimeter()
    {
        return 2 * Math.PI * radius;
    }

}
