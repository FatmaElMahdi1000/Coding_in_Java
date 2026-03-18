package WhileLoop;
import java.util.ArrayList;
import java.util.Scanner;

public class AverageValue {

    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        ArrayList<Integer> arrList = new ArrayList<>();
        int i = 0;
        int num;
        while(i <= 5)
        {
            System.out.println("Please Enter a number: ");
            num = obj.nextInt();
            arrList.add(num);
            i++;
        }
        System.out.println("The list is = " + arrList);

    }
}
