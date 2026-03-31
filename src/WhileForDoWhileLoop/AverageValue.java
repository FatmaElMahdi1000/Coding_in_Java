package WhileForDoWhileLoop;
import java.util.ArrayList;
import java.util.Scanner;

public class AverageValue {

    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        ArrayList<Double> arrList = new ArrayList<>();
        int i = 1;
        double num;
        double sum = 0;
        while(i <= 5)
        {
            System.out.println("Please Enter a number: ");
            num = obj.nextInt();
            sum+= num;
            arrList.add(num);
            i++;
        }
        System.out.println("The list is = " + arrList + "\n" +"The Average:" + sum/arrList.size());
        obj.close();
    }
}
