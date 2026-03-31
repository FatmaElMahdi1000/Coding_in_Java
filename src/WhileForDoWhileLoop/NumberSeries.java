package WhileForDoWhileLoop;
import java.util.Scanner;
import java.util.ArrayList;
public class NumberSeries {


    public static void main(String[] args)
    {
        ArrayList<Integer> arr = new ArrayList<Integer>();

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the first number of your Series: ");
        int num1 = obj.nextInt();
        System.out.println("Enter the last number of your Series: ");
        int num2 = obj.nextInt();
        int count = 0;

        while(num1 <= num2)
        {
            arr.add(num1);
            num1++;
        }
        System.out.println(arr);
    }
}
