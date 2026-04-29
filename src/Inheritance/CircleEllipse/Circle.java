package Inheritance.CircleEllipse;
import java.util.*;
import javax.swing.JOptionPane;

public class Circle
{
    //(x,y) this is the position of the circle
    //Both protected to become inherited by the Children
    protected int x;
    protected int y;
    static int counter = 0;
    double radius;
    Circle()
    {
        //check this() comment in the 2nd constructor
        counter++;
    }
    Circle(int x, int y, int r)
    {
        //Constructor chaining to avoid calculating the number of created objects twice using counter++ in both constructor.
        //We can use add Counter++ only once
        this();
        this.x = x;
        this.y = y;

        if(r > 0)
        {
            this.radius = r;
        }
        else
        {
            this.radius = 1;
        }
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double r) {
        if(r <= 0)
        {
            this.radius = 1;
        }
        else
        {
            this.radius = r;
        }
    }

    public double getDiameter()
    {
        return 2* this.radius;

    }
    public double getArea()
    {
        return Math.PI* Math.pow(this.radius,2);

    }
    public double getCirc()
    {
        return 2*Math.PI* radius;
    }

    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        //Array of objects //define number of circles
        Circle[] circ = new Circle[2];
        for(int i = 0; i<circ.length;i++)
        {
            circ[i] = new Circle();
            System.out.print("Enter the X Position of the circle: ");
            circ[i].x = obj.nextInt();

            System.out.print("Enter the Y Position of the circle: ");
            circ[i].y = obj.nextInt();
            System.out.print("Enter the Circle radius: ");
            circ[i].radius = obj.nextDouble();

            System.out.println("The Circle Position is: " + "(" + circ[i].x + "," + circ[i].y + " AND Radius is: " + circ[i].radius);

            JOptionPane.showMessageDialog(null, "Circle Area: \n" + circ[i].getArea()+ "\n"+"Circle Circumference: " + " \n" + circ[i].getCirc());
        }

        System.out.println("Number of created Circles: " + Circle.counter);

    }

}
