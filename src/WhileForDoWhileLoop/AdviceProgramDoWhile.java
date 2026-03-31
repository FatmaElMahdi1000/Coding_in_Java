package WhileForDoWhileLoop;
import java.util.ArrayList;
import java.util.Scanner    ;
import java.util.Random;

public class AdviceProgramDoWhile {

    public static void main(String[] args)
    {
        ArrayList<String> answers = new ArrayList<>();
        answers.add(0, "No answer, Sorry!");
        answers.add(0, "Hard Question!");
        answers.add(0, "Ask GPT!Sorry!");
        answers.add(0, "Think again about the question, you'll find the answer yourself!");
        System.out.println(answers);
        String ans1;
        String question;
        Scanner obj = new Scanner(System.in);
        Random rnd = new Random();
        do{
            System.out.println("Do you've a question? ");
            ans1 = obj.nextLine().toLowerCase().trim();
            if(!ans1.equals("yes")) //force to break, to not move with the next part
            {
                break;
            }
            System.out.println("Ok, Go ahead, what is it? ");
            question = obj.nextLine();
            System.out.println("The Answer to your question is: ");
            //REVIEW
            String element = answers.get(rnd.nextInt(answers.size()));
            System.out.println(element);
        }
        while(true);
        obj.close();
    }

}
