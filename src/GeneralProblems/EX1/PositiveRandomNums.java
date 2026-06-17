package GeneralProblems.EX1;

import java.util.*;
import java.util.Random;

public class PositiveRandomNums {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>(4);
        int i = 0;
        while(i <= 3)
        {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            arr.add(num);
            i++;
        }
        //Last Index in the array
        System.out.println(arr.size()-1);
        //get the last num in the arr
        System.out.println(arr.get(arr.size() - 1));

        List<Integer> RandomArr = new ArrayList<>(4);

        //Generating Random nums and stor in an array
        int j = 0;

        while(j <= 3)
        {
            Random rnd = new  Random();
            RandomArr.add(rnd.nextInt(1, 10));
            j++;
        }

        for(int k = 0; k < RandomArr.size(); k++)
        {
            System.out.print(RandomArr.get(k) + " ");
        }
    }

}
