package Arithmetic;
import java.util.ArrayList;

public class factorial {
    public static void main(String[] args)
    {
        int fact = 1;
        int size = 6;
        ArrayList<Integer> Factarr = new ArrayList<>();
        for(int num = 1; num<size; num++)
        {
            fact *= num;
            Factarr.add(fact);
        }
        System.out.print(Factarr);
    }
}
