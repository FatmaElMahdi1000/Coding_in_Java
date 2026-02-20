package inputs;
import java.util.Scanner;

public class ProductOfTwo {

    public double product(double a, double b)
    {
        return a * b;
    }
    public static void main(String[] args)
    {
        //create scanner object, one is enough for all inputs
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter a (the first number): ");
        double a = obj.nextDouble();
        System.out.print("Enter b (the 2nd number): ");
        double b = obj.nextDouble();
        //accessing class to access the product method later
        ProductOfTwo result = new ProductOfTwo();
        double res = result.product(a, b);
        System.out.println("Product of a * b = " + res);
        //we must close the input stream we opened using Scanner.
        obj.close();
    }
}
