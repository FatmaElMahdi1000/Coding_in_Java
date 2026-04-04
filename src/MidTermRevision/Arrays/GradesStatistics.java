package MidTermRevision.Arrays;
import java.util.*;
import java.util.Collections;

public class GradesStatistics {

    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int StNum = obj.nextInt();
        ArrayList<Integer> grades = new ArrayList<>();
        for(int i = 0; i <StNum; i++)
        {
            System.out.print("Enter the grade of student#" + (i+1) + ": ");
            int grade = obj.nextInt();
            if(0 <= grade && grade <= 100)
            {
                grades.add(grade);
            }
            else
            {
                System.out.println("Invalid Value! Try again");
                i--;
            }
        }
        System.out.println("Grades: "+ grades);
        System.out.println("Maximum value = " + Collections.max(grades));
        System.out.println("Minimum value = " + Collections.min(grades));
    }
}
