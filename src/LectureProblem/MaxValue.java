package LectureProblem;
import java.util.Scanner;
//max class
public class MaxValue {
    //attributes
    int size;
    //array and setting array size
    int[] numbers;
    //constructor
    MaxValue()
    {
        this.size = 5;
        this.numbers = new int[size];
    }
    //method
    int max()
    {
        //scanner must be created outside loop, creating it inside the loop is bad practice
        Scanner obj = new Scanner(System.in);
        for(int i = 0; i <size; i++)
        {
            System.out.print("Enter a number: ");
            this.numbers[i] = obj.nextInt();
        }
        //if set_value == true

        int maxvalue = this.numbers[0];
        for(int j = 0; j< size; j++)
        {
            if(this.numbers[j] > maxvalue)
            {
                maxvalue = this.numbers[j];
            }
        }
        //closing Scanner resource .
        obj.close();
        return maxvalue;

    }


    public static void main(String[] args)
    {
        MaxValue object = new MaxValue();
        System.out.println("Max Value is = " + object.max());

    }

}
