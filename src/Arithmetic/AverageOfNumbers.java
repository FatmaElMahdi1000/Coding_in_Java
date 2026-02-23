package Arithmetic;
import java.util.Scanner;
public class AverageOfNumbers {
    //n : number of entered nums
    public double average(int n, Scanner obj1)
    {
        double sum = 0;
        int i = 1;
        while(i <= n)
        {
            System.out.print("Enter a number: ");
            double num = obj1.nextDouble();
            sum += num;
            i++;
        }
        //Returning the average.
        return sum / n;
    }
    public static void main(String[] args)
    {
        //Scanner object to get inputs, we'll pass scanner to the method as paramater so it can be used there as well,
        Scanner obj1 = new Scanner(System.in);
        System.out.print("Enter the number of your numbers: N =  ");
        int n = obj1.nextInt();
        //Our main Class object
        AverageOfNumbers obj2 = new AverageOfNumbers();
        double res = obj2.average(n, obj1);
        System.out.println("The average of the entered numbers is = " + res);
        //We are opening a connection to the input stream (System.in). That’s a resource managed by the OS, so we must close it.
        obj1.close();
    }
}
