package Arithmetic;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersGreaterThanAverage
{
    public static void main()
    {
        int sum = 0;
        int size = 5;
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        for (int q = 0; q < size; q++) {
            System.out.println("Enter a number: ");
            int num = scan.nextInt();
            sum += num;
            arr.add(num);
        }
        System.out.println(arr);
        double Avg = (double) sum / (double) size;

        System.out.println("The Average = " + Avg);
        int i = 0;
        //for getting index of Java array, we write it like this: arr.get(i), using .get()
        ArrayList<Integer> GNums = new ArrayList<>();
        while(i < size)
        {
            if(arr.get(i)>Avg)
            {
                GNums.add(arr.get(i));
            }
            i++;
        }
        System.out.println("Nums greater than the average = " + GNums);
    }


}
