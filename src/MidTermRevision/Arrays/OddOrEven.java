package MidTermRevision.Arrays;
import java.lang.reflect.Array;
import java.util.ArrayList;
public class OddOrEven {

    public static void main(String[] args)
    {
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        for(int i = 0; i <50; i++)
        {
            if(i % 2 == 0)
            {
                even.add(i);
            }
            else
            {
                odd.add(i);
            }
        }
        System.out.println("Odd List: " + odd);
        System.out.println("Even List: " + even);
    }

}
