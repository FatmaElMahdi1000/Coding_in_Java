package Basics;

public class Constants {
    final int c = 5;

    public static void main(String[] args)
    {
        //object
        Constants obj = new Constants();
        System.out.println("Initial Value of C = " + obj.c);
        //preincrement (the program is refusing accepting this line below; as c must only be used it's not writable due to
        //final usage
//        System.out.println("Initial Value of C = " + (++obj.c));

    }

}
