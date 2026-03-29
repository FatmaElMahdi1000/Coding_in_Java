package Logic1IfWhileSwitches;
import java.util.Scanner;
public class more20Ternary {
    public static void main(String[] args)
    {
        Scanner obj1 = new Scanner(System.in);
        int num;
        System.out.print("Enter a number: ");
        num = obj1.nextInt();
        boolean result = (num % 20 == 1 || num % 20 == 2) ? true : false;
        System.out.println(result);
    }
}
