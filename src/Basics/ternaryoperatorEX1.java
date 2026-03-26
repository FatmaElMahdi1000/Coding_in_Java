package Basics;

public class ternaryoperatorEX1 {

    public static void main(String[] args)
    {
        int x = 4;
                   //if true, then(?) print E else(:) print "O"
        String c = (x % 2 == 0) ? "E" : "O";
        System.out.println(c);
    }
}
