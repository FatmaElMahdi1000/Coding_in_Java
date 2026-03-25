package Arithmetic;
import java.util.ArrayList;

public class Fibonaci {
    public static void main(String[] args)
    {
        ArrayList<Integer> FibArr = new ArrayList<>();
        int FibNum;
        FibArr.add(1);
        FibArr.add(1);
        int size = 6;
        for(int i = 0; i < size; i++)
        {
            //this is wrong: FibArr.get(-1), in java
            //FibArr.getLast()  === FibArr.get(FibArr.size() -2)
            FibNum = FibArr.get(FibArr.size() - 1)    + FibArr.get(FibArr.size() - 2);
            FibArr.add(FibNum);

        }
        System.out.println(FibArr);


    }
}
