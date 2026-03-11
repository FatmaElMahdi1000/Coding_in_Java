package LectureProblem;
import java.util.Scanner;

public class MaxValue_MultipleObjects
{
    //attributes
    int size;
    int[] nums;
    //constructor
    MaxValue_MultipleObjects(int size)
    {
        this.size = size;
        //REVIEW  allocating memory for an array
        this.nums = new int[size];
    }

    // Method to read numbers from a Scanner passed from main
    public int max(Scanner obj)
    {
        for(int j = 0; j< size; j++)
        {
            System.out.print("Enter a number: ");
            nums[j] = obj.nextInt();
        }

        int maxVal = nums[0];

        for(int i = 1; i < size; i++)
        {
            if (nums[i] > maxVal)
            {
                maxVal = nums[i];
            }
        }
        return maxVal;
    }

    //Main
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        // Object 1 → array of size 5
        MaxValue_MultipleObjects arr1 = new MaxValue_MultipleObjects(5);
        // Object 1 → array of size 7
        MaxValue_MultipleObjects arr2 = new MaxValue_MultipleObjects(7);
        System.out.println("Max of the first array =  "+ arr1.max(obj));
        System.out.println("Max of the second array =  "+ arr2.max(obj));

    }

}
