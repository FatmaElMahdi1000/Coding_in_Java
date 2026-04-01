package WhileForDoWhileLoop;
import java.util.*;
//System.currenttimemillis
public class MultipleSubtraction {

    //like adding test time for the quiz
    public static void main(String[] args)
    {
        long QuizStartTime = System.currentTimeMillis();
        int NumOfQus = 5;
        int counter = 1;
        int wrong = 0;
        int correct = 0;
        Scanner obj = new Scanner(System.in);
        String output = " ";

        while(counter <= NumOfQus)
        {

            int temp;
            System.out.print("Enter Number1: ");
            int num1 = obj.nextInt();
            System.out.print("Enter Number2: ");
            int num2 = obj.nextInt();
            if(num1 < num2)
            {
                temp = num1;
                num1 = num2;
                num2 = temp;
            }
            System.out.println("What's " + num1 + "-" + num2 + " ?");
            int ans = obj.nextInt();

            if(ans == (num1 - num2))
            {
                System.out.println("You're Correct! :D");
                correct+= 1;
                output += "* " + num1;
                output += " - " + num2 + " = " + ans +" CORRECT."+"\n";
            }
            else
            {
                System.out.println("Your answer is Wrong :(!");
                System.out.println("The answer should be = "  + (num1 - num2));
                wrong+= 1;
                output += "* " + num1;
                output += " - " + num2 + " = " + ans  + " Wrong." + "\n";
            }
            counter+=1;
        }

        long QuizEndTime = System.currentTimeMillis();
        //we'll print this: Duration of the quiz
        long QuizTime = QuizEndTime - QuizStartTime;
        System.out.println(output);
        System.out.println("Wrong Answers = "+ wrong);
        System.out.println("Right Answers = "+ correct);
        System.out.println("Time Spent on the test(in seconds) = " + QuizTime/1000 + " seconds.");
    }

}
