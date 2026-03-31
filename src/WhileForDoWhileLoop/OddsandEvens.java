package WhileForDoWhileLoop;
import java.util.ArrayList;
import java.util.Arrays;

public class OddsandEvens {

    public static void main()
    {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 1; i <=5; i++)
        {
            if(i % 2 == 0)
            {
                System.out.println(i + "is an even!");
            }
            else
            {
                System.out.println(i + " is an odd!");
            }
            arr.add(i);
        }
        System.out.println(arr);
    }
}
