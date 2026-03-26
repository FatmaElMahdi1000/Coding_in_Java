package Basics;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Random;

public class TenPositiveRandoms {

    public static void main(String[] args)
    {
        ArrayList<Double> seq = new ArrayList<>();
        Random rnd = new Random();
        for(int i = 1; i <= 10; i++)
        {
            double num = rnd.nextDouble(1,100);
            seq.add(num);
        }
        System.out.println(seq);

    }

}
