package GeneralProblems.EX1;
import java.util.*;
public class factorial {

    //Fact = 5*4*3*2*1*
    public static void main(String[] args)
    {
        List<Integer> factArr = new ArrayList<>();
        List<Integer> factSeq = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int input = sc.nextInt();
        int fact = 1;

        for(int i = input; i >= 1; i--)
        {
            fact *= i;
            factArr.add(fact);
            factSeq.add(i);
        }

        System.out.println(fact);
        for(int j = 0; j < factArr.size(); j++)
        {
            System.out.print(factArr.get(j) + " ");
        }

        System.out.println();
        for(int k = 0; k < factSeq.size(); k++)
        {
            System.out.print(factSeq.get(k) + " ");
        }

    }
}
