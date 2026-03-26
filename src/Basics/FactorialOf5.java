package Basics;
import java.util.ArrayList;

public class FactorialOf5 {

    public static void main(String[] args)
    {
        int n = 5;
        ArrayList<Integer> seq = new ArrayList<>();

        int fact = 1;

        for(int i = 1; i<10; i++)
        {
            fact *= i;
            seq.add(fact);
        }
        System.out.println(seq);
        System.out.println("5! = " + seq.get(n-1));
    }

}
