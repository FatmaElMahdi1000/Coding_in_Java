package Arithmetic;
import java.util.Scanner;

public class BasicArithmetic {

    public String arithm(double a, double b)
    {
        return a + " + " + b + " = " + (a + b) + '\n'+
                a + " - " + b + " = " + (a - b) + '\n'+
                a + " * " + b + " = " + (a * b) + '\n'+
                a + " / " + b + " = " + (a / b) + '\n'+
                a + " mod " + b + " = " + (a % b) + '\n';
    }
    public static void main(String[] args)
    {
        //create scanner object
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the 1st number (a): ");
        double a = obj.nextDouble();
        System.out.print("Enter the 2nd number (b): ");
        double b = obj.nextDouble();
        //main class object to access "Arithm" method.
        BasicArithmetic result = new BasicArithmetic();
        String res = result.arithm(a, b);
        System.out.println("ALL results:\n " + res);
    }
}
