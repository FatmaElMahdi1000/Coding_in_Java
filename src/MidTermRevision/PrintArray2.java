package MidTermRevision;
import java.util.*;
import java.util.Arrays;

public class PrintArray2 {

    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        //Method #1
        int[] itemarr1 = new int[6];
        //Method #2
        ArrayList<Integer> itemarr2 = new ArrayList<>();
        for(int i = 0; i <itemarr1.length; i++)
        {
            System.out.print("Enter a number for Array#1: ");
            int num1 = obj.nextInt();
            System.out.print("Enter a number for Array#2: ");
            int num2 = obj.nextInt();
            itemarr1[i]= num1;
            itemarr2.add(num2);
        }
        System.out.println(Arrays.toString(itemarr1));
        System.out.println(itemarr2);
    }

}
