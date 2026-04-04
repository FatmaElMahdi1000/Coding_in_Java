package MidTermRevision.Arrays;
import java.util.*;
public class PrintArrayInStars {

    public static void main(String[] args)
    {
        int[] arr = new int[5];
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the array elements(Make sure to have a space in between): ");
        for(int i = 0; i<arr.length; i++)
        {
            //Scanner helps to read and splitting if there's a space
            arr[i]= obj.nextInt();
            System.out.println("*".repeat(arr[i]) + "("+ arr[i]+ ")");
        }
        System.out.println(Arrays.toString(arr));

    }
}
