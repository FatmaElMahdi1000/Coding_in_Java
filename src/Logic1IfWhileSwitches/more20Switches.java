package Logic1IfWhileSwitches;
import java.util.Scanner;
public class more20Switches {

    public static void main(String[] args)
    {
        Scanner obj2 = new Scanner(System.in);
        int num;
        System.out.print("Enter a number: ");
        num = obj2.nextInt();
        boolean res = num % 20 == 1 || num % 20 == 2;
        switch(res)
        {
            case true:
                System.out.println(true);
                break;
            case false:
                System.out.println(false);
                break;
        }
    }
}
