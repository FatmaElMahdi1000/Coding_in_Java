package Basics;

public class PrimitiveDataType
{
    //this is accepted in java, i will be printed as the ascii of a, which is a number
    int i = 'a';
    float a = 3.04f;
    //ASCII code, no quotes to get printed.
    char b = 49;
    //unicode
    char c = '\u0034';

    int f = 5;
    int g = 2;
    //for post increment example
    int n = 19;
    int r = n++; //it's like saying r = n, then n = n + 1

    public static void main(String[] args)
    {
        PrimitiveDataType obj = new PrimitiveDataType();
        System.out.println(obj.c);
        System.out.println(obj.b);
        //incrementing to the subsequent number;

//        //pre-increment will increment t0 the subsequent character in char c then, store in char d to get printed.
//        char d = ++obj.c;
//        System.out.println("PRE INCREMENT: " + d);

        //post increment, will print the same character in char c then, increment to the subsequent c character
        char e = obj.c++;
        System.out.println("POST INCREMENT: " + e) ;

        //since we're dividing int / int, it will truncate the decimal part
        System.out.println("Division = "+ obj.f / obj.g);
        //solution is to type cast
        System.out.println("Updated Division res= "+ (double) obj.f / obj.g);

        System.out.println("Ascii of i = "+  obj.i);

        //another example of pre-increment
        System.out.println("Pre increment, r = " + obj.r + " n = "+ obj.n);

    }

}


