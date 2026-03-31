package WhileForDoWhileLoop;
import java.util.*; //include scanner / arrays / Randoms.



public class RepeatAdditionQuiz {

    public static void main(String[] args)
    {
        Random rnd = new Random();
        Scanner obj = new Scanner(System.in);
        int number1 = rnd.nextInt(1, 10);
        //another way
        int number2 = rnd.nextInt(1, 10);
//        System.out.println(number1);
//        System.out.println(number2);
        System.out.print("What's the sum of: "+ number1+  " + " + number2 + "? ");
        int ans = obj.nextInt();
        while(number1 + number2 != ans)
        {
            System.out.println("Try again");
            System.out.print("What's the sum of: "+ number1+  " + " + number2 + "? ");
            ans = obj.nextInt();
        }
        System.out.print("Your Guess Is Correct!");

    }

}
