package WhileForDoWhileLoop;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
public class EveryThird {

    public static void main (String[] args)
    {
        Scanner obj = new Scanner(System.in);

        ArrayList<Double> Entirearr = new ArrayList<>();
        int size = 12;

        for(int i = 1; i <= size; i++)
        {
            double num;
            System.out.println("Enter a number: ");
            num = obj.nextDouble();
            Entirearr.add(num);
        }
        System.out.println(Entirearr);
        //how many thirdnum in Entirearr
        int new_size = Entirearr.size() / 3;
        double[] newarr = new double[new_size];

        int j = 2; //note; inex 0 1 2 element at index 2 is the 3rd;
        int k = 0;
        while(j < size)
        {
            //get() to get the element at that index
            newarr[k++] = Entirearr.get(j);
            j += 3; // move to the next 3rd element
        }
        System.out.println(Arrays.toString(newarr));

    }
}
