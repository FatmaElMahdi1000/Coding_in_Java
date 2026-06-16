package Inheritance.Ex3;

public class Ellipse extends Circle

{
    //we'll only add Ellipse constructor and add the additional variable/ attribute needed
    //which is the 2nd radius (Y-Radius), (X-radius will get inherited) and x,y postitions as well

    private double radius2;
    public Ellipse(int x, int y, double radius,double radius2)
    {
        super(x,y,radius);
        if(radius2 <0)
        {
            this.radius2 = 1;
        }
        else
        {
            this.radius2 = radius2;
        }
    }

    public double getRadius2() {
        return radius2;
    }

    public void setRadius2(double radius2) {
        if(radius2 <0)
        {
            this.radius2 = 1;
        }
        else
        {
            this.radius2 = radius2;
        }
    }

    public double getEllipseArea()
    {
        return Math.PI * radius2 * radius; //radius from the Circle.
    }

    public double getEllipseCircum()
    {
        return (2*Math.PI*Math.sqrt(radius*radius +   radius2*radius2)/2.0); //radius from the Circle.
    }

}
