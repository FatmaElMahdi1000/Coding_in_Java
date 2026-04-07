package MidTermRevision.Loops;
import java.util.*;
public class RandomUpperCase {
    public static void main(String[] args)
    {
        Random rnd = new Random();
                              //Ascii code.
        int n  = rnd.nextInt(0, 26);
        n = 'A' + n; //Random upper case , for random lower change it from 'A' to 'a'
        char letter = (char) n;
        System.out.println(letter);

    }
}
