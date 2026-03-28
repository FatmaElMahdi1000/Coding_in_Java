package Basics;
import java.util.Scanner;
public class DecToBinary {

    public static void main(String[] args)
    {
        double DecNum;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a decimal number to convert: ");
        DecNum = obj.nextDouble();
        String Bin = "";
        double DivRes = DecNum / 2; //5 / 2 = 2.5
//        double rem = DecNum % 2; // 5 % 2 = 1.
        while(DivRes != 0.00)
        {
            double rem =  DecNum % 2;
            //converting the num to string and concatenating it.
            //REVIEW : converting to String
            Bin += String.valueOf((int) rem);
            DecNum = (int) DivRes;

            DivRes = DecNum / 2;

        }
        //REVIEW : StringBuilder
        String BinReversed = new StringBuilder(Bin).reverse().toString();
        System.out.println(BinReversed);

    }
}
