package Basics;

public class TernaryOperatorEx2 {

    public static void main(String[] args)
    {
        int mark = 80;
        String grade;
                //if , ?then print A, (:) means else if (?) then, print "B", else: "C"
        grade = (mark >= 90) ? "A" : (mark >= 80) ? "B" : "C";
        System.out.println(grade);

        char ch = 'C'; // C in Ascii is 67
        int value = (ch > 66) ? 200 : 100;
        System.out.println(value);
    }
}
