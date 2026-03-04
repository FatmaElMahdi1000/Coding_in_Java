package OOP;

public class Circle
{
    //attributes/ ABout final and private: as soon as the radius defined, it becomes constant, not before that.
     private double radius;
     //constructor to set radius, like init in python
     Circle(double radius)
     {
         if (radius<= 0)
         {
             //REVIEWIllegalArgumentException
             throw new IllegalArgumentException("Radius Must be a positive value!");
         }
         this.radius = radius;
     }

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
