package inputs;
import java.util.Scanner;
public class input2 {

    public String sent(int num, String n)
    {
        return "Ok, you've entered:" + " " +num + " That can be also written as " + n;
    }
    public static void main(String[] args)
    {
        //create scanner object
        Scanner obj = new Scanner(System.in);
        //reading a string
        System.out.print("Enter a number: ");
        int num = obj.nextInt();
        System.out.print("Spell out the same number(write in words): ");
        String n = obj.next();
        //creating object from the main class to access the method
        input2 obj2 = new input2();
        String sentence = obj2.sent(num, n);
        System.out.println(sentence);

    }
}
