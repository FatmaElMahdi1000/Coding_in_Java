package MidTermRevision.Loops;
import java.util.*;

//REVIEW WHILE CODE,
public class LotteryREVIEWCODE {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        Random rnd = new Random();
        int checking;
        int lotteryNum = rnd.nextInt(100,1000);
        System.out.println(lotteryNum);
        do
        {
            System.out.print("Enter 3 digit number ");
            int num = obj.nextInt();

            //Review 100/1000 = 0.100 .. int will truncate to be 0. getting 0 means we've 3 digit num in num
            checking = num / 1000;
            //OR: (num < 100 || num > 999) it also checks for 3 digit number
            if(checking == 0 && num >= 100)
            {
                if(num == lotteryNum)
                {
                    System.out.println("You WON 10000$");

                }
                else if(String.valueOf(num).length() == String.valueOf(lotteryNum).length())
                {
                    //REVIEW
                    char[] userDigits = String.valueOf(num).toCharArray();
                    char[] lotteryDigits = String.valueOf(lotteryNum).toCharArray();
                    Arrays.sort(userDigits);
                    Arrays.sort(lotteryDigits);
                    if (Arrays.equals(userDigits, lotteryDigits)) {
                        System.out.println("All digits match! You WON $3,000");
                    }

                }
                else
                {
                    System.out.println("Sorry, no match.");
                }
            }
            else
            {
                continue;
            }
        }
        while(true);

    }
}
