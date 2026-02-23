package Arithmetic;
import java.util.Scanner;

public class SwapTwoVariables {


    public void swapping(int[] numbers, int arr_size)
    {
        int temp = numbers[0];
        numbers[0] = numbers[1];
        numbers[1] = temp;
        System.out.print("Swapped Array: [");
        for(int k = 0; k < arr_size; k++) {
            if (k != arr_size-1)
            {
                System.out.print(numbers[k] + ",");
            }
            else{
                System.out.print(numbers[k]);
            }
        }
        System.out.println("]");
    }
    public static void main(String[] args)
    {
        //numbers.length getting array size
        int[] numbers = new int[2];
        int arr_size = numbers.length;
        Scanner obj = new Scanner(System.in);
        for (int i = 0; i< arr_size; i++)
        {
            System.out.print("Enter a number " + (i+1) + ": ");
            numbers[i] = obj.nextInt();
        }
        System.out.print("Original Array: [");

        for(int j = 0; j< arr_size; j++) {
            if (j != arr_size-1)
            {
                System.out.print(numbers[j] + ",");
            }
            else{
                System.out.print(numbers[j]);
            }
        }
        System.out.println("]");
        //accessing the class to access the method
        SwapTwoVariables object = new SwapTwoVariables();
        object.swapping(numbers, arr_size);
        //to close input stream opened by Scanner
        obj.close();

    }
}
