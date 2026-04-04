package MidTermRevision;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class PrintArray {

    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number of items in the arrays: ");
        int itemsNum = obj.nextInt();
        int[] itemsArr = new int[itemsNum];
        System.out.println("Enter the value of all items (separated by space): ");

        for(int i = 0; i <itemsNum; i++)
        {
            itemsArr[i] = obj.nextInt();
        }
        System.out.println(Arrays.toString(itemsArr));

    }

}
