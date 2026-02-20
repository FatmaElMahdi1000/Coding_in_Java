package inputs;
import java.util.Scanner;

public class ProductOfTwo {

    public double product(double a, double b)
    {
        return a * b;
    }
    public static void main(String[] args)
    {
        //create scanner objects
        //a
        Scanner a_obj = new Scanner(System.in);
        //b
        Scanner b_obj = new Scanner(System.in);
        //Reading 2 double numbers
        System.out.print("Enter a (the first number): ");
        double a = a_obj.nextDouble();
        System.out.print("Enter b (the 2nd number): ");
        double b = b_obj.nextDouble();
        //accessing class to access the product method later
        ProductOfTwo result = new ProductOfTwo();
        double res = result.product(a, b);
        System.out.println("Product of a * b = " + res);
    }
}
