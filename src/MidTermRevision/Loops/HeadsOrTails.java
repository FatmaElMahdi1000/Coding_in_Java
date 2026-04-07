package MidTermRevision.Loops;
import java.util.Random;
import java.util.Scanner;
public class HeadsOrTails
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        Random rnd = new Random();
        //exclusive
        int res = rnd.nextInt(0,2);
        System.out.println(res);
        System.out.print("Enter a guess: ");
        int guess = obj.nextInt();

        //ternary operator
        String result = (guess == res) ? "Correct" : "Incorrect";
        System.out.println(result);
    }
}
