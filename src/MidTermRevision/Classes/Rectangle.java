package MidTermRevision.Classes;
import java.util.*;
public class Rectangle
{
    //attributes
    double height;
    double width;

    //non parameterized constructor
    Rectangle()
    {
        height = 1;
        width = 1;
    }
    Rectangle(double height, double width)
    {
        this.height = height;
        this.width = width;
    }
    void setHeight(double height)
    {
        if(width <0)
        {
            width = 1;
        }
        else
        {
            height = this.height;
        }
    }
    void setWidth(double width)
    {
        if(width <0)
        {
            width = 1;
        }
        else
        {
            width = this.width;
        }
    }
    double getHeight()
    {
        return this.height;
    }

    double getWidth()
    {
        return this.width;
    }
    public double rectArea()
    {
        return width*height;
    }
    public double perimeter()
    {
        return 2*(width+height);
    }
    public String Shape()
    {
        if(width == height)
        {
            return "It's a square!";
        }
        else if(height>width)
        {
            return "It's a horizontal rectangle!";
        }
        else
        {
            return "It's a vertical rectangle!";
        }
    }
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        Rectangle Rect1 = new Rectangle();

        Rectangle Rect2 = new Rectangle();

        System.out.print("Enter the width of Rectangle1: ");
        Rect1.width = obj.nextDouble();

        System.out.print("Enter the height of Rectangle1: ");
        Rect1.height = obj.nextDouble();

        System.out.print("Enter the width of Rectangle2: ");
        Rect2.width = obj.nextDouble();

        System.out.print("Enter the height of Rectangle2: ");
        Rect2.height = obj.nextDouble();
        if(Rect1.rectArea() > Rect2.rectArea())
        {
            System.out.println(
                    "Shape Info: " + "\n"+
                    "Shape is: " + Rect1.Shape() + "\n"+
                    "Width: "+Rect1.width+"\n" +
                    "Height: " + Rect1.height +"\n" +
                    "Area: " + Rect1.rectArea()+"\n");
        }
        else
        {
            System.out.println(
                    "Shape Info: " + "\n"+
                            "Shape is: " + Rect2.Shape() + "\n"+
                            "Width: "+Rect2.width+"\n" +
                            "Height: " + Rect2.height +"\n" +
                            "Area: " + Rect2.rectArea()+"\n");
        }
        //Rect3
        Rectangle rect3 = new Rectangle();
        System.out.println("Default Width = "+rect3.width + " Default Height= "+rect3.height);

    }
}
