package Arithmetic;
import java.util.Scanner;
public class MultiplicationTable {

    public void multi(int num)
    {
        int i = 1;
        while(i <= 10) {
            System.out.println(num + "x" + i + " = " + (num * i));
            i++;
        }
    }
    public static void main(String[] args)
    {
        //Scanner obj
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = obj.nextInt();
        //class object to access the method
        MultiplicationTable class_obj = new MultiplicationTable();
        class_obj.multi(num);
    }
}
