package Arithmetic;
import java.util.Scanner;
import java.util.Arrays ;
//NOT OOD
public class Numabsolute {
    //constructors
//    Numabsolute(double a, double b)
//    {
//        if(a < 0 && b < 0) {
//            this.a = a;
//            this.b = b;
//        }
//        else
//        {
//            throw new IllegalArgumentException("Numbers must be negative!");
//        }
//
//    }

    //returning a list of doubles : double[]
    double[] abs(double a, double b)
    {
        double[] nums = new double[2];
        double AbsOfa = Math.abs(a);
        double AbsOfb = Math.abs(b);
        nums[0] = AbsOfa;
        nums[1] = AbsOfb;
        return nums;

    }

    public static void main(String[] args)
    {
        Numabsolute result = new Numabsolute();
        Scanner obj = new Scanner(System.in);
        double a;
        while(true)
        {
            System.out.print("Enter a number (Must be a double): ");
            if(obj.hasNextDouble())
            {
                a = obj.nextDouble();
                break;
            }
            else
            {
                System.out.println("Invalid Entry!");
                obj.next(); //move to the next input then check with the while loop again till
                // the enter number becomes a double.
            }
        }

        double b;
        while(true)
        {
            System.out.print("Enter another number (Must be a double): ");
            //hasNextDouble() checks the next input without crashing.
            if(obj.hasNextDouble())
            {
                b = obj.nextDouble();
                break;
            }
            else
            {
                System.out.println("Invalid Entry");
                //prompt the user for the next input
                obj.next();
            }
        }
        //must concatenate the double array with the string
        System.out.println("A list of absoulte double values: "+ Arrays.toString(result.abs(a, b)));
    }

}
