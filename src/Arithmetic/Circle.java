package Arithmetic;
import java.util.Scanner;
//Math is inside java.lang, and java.lang is automatically imported in every Java program.

public class Circle {

    public String circle_cal(double radius)
    {
        double area = Math.PI * Math.pow(radius, 2);
        double Per =2 * Math.PI *  radius;

        return "Perimeter is = " + Per + "\n"+
                "Area is = " + area;
    }
    public static void main(String[] args)
    {
        Scanner scan_obj = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double r = scan_obj.nextDouble();
        //creating obk from the main class to access the method
        Circle obj = new Circle();
        String result = obj.circle_cal(r);
        System.out.println(result);

    }
}
