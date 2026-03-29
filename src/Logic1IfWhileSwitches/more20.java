package Logic1IfWhileSwitches;
import java.util.Scanner;

public class more20 {

    public static void main(String[] args)
    {
        Scanner object = new Scanner(System.in);
        int num;
        System.out.print("Enter a number: ");
        num = object.nextInt();
        if(num % 20 == 1 || num % 20 == 2)
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }

    }
}
