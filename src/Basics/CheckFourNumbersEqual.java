package Basics;
import java.util.ArrayList;
import java.util.Scanner;

public class CheckFourNumbersEqual
{

    public void EqualOrNot(ArrayList<Double> seq)
    {
        //get returns a double value
        boolean allEqual = true;
        double temp = seq.get(0);
        for(int j= 0; j < seq.size(); j++)
        {
            if(Math.abs(seq.get(j) - temp) > 0.0000001)
            {
                System.out.println("Array Element Are Not Equal!");
                allEqual = false;
                break;
            }
        }

        if(allEqual) {
            System.out.println("Array Element Are Equal!");

        }
    }

    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        ArrayList<Double> seq = new ArrayList<>();
        int counter = 1;
        while(counter <= 4)
        {
            System.out.println("Enter a number: ");
            double num = obj.nextDouble();
            seq.add(num);
            counter++;
        }
        System.out.println(seq);

    }

}
