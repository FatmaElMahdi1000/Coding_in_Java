package MidTermRevision;
import java.util.*;
public class FahrToCelsius
{
    public static void main(String[]args)
    {
        Scanner obj = new Scanner(System.in);
        String type;
        do
        {
            System.out.println("Which type of degree you'd like to convert from f or c: ");
            type = obj.nextLine().toLowerCase();
        }
        while(!type.equals("f") && !type.equals("c"));
        System.out.println("Enter the degree: ");
        double degree = obj.nextDouble();
        if(type.equals("f"))
        {
            System.out.println("From "+ degree +"F to C = " + (degree-32.0)*(5.0/9.0) + "C");
        }
        if(type.equals("c"))
        {
            System.out.println("From " + degree + "C to F = " + ((degree * 9.0 / 5.0) + 32) + "F");
        }
        //closing the input stream
        obj.close();
    }

}
