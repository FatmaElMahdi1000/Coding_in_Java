package MidTermRevision;
import java.util.Scanner;

public class FindPower {

    //overloading
    double FindPower(double base, double exponent)
    {
        return Math.pow(base, exponent);

    }

    int FindPower(int base, int exponent)
    {
        return (int) Math.pow(base, exponent);

    }
    public static void main(String[] args)
    {
        FindPower obj = new FindPower();
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the Exponent: ");
        double expo = num.nextDouble();
        System.out.print("Enter the Base: ");
        double base = num.nextDouble();
        //method with ints returning integer
        System.out.println("Integer result: " + obj.FindPower((int)base, (int)expo));

        //method with doubles returning a double
        System.out.println("Double result: " + obj.FindPower(base, expo));

    }
}
