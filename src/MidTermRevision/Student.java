package MidTermRevision;
import java.util.*;
public class Student
{
    //attributes
    String FName;
    String LName;
    //accessed by class name, shared by all objects.
    static int year = 2026;
    String Major;
    //constructors
    Student(String FName, String LName, String Major)
    {
        this.FName = FName;
        this.Major = Major;
        this.LName = LName;
    }

    public String getMajor() {
        return Major;
    }
    public void setMajor(String Major)
    {
        this.Major = Major;
    }

    String getFullName()
    {
        return this.FName + " "  +  this.LName;
    }
    public static void main(String[] args)
    {
        Student st1 = new  Student("Fatma", "ElMahdi", "CS");
        System.out.println("Student Full Name: "+ st1.getFullName());
        Student st2 = new  Student("Sahar", "ElMahdi", "CS");
        System.out.println("Student Full Name: "+ st2.getFullName());
        System.out.println(st1.getMajor());
        if(st1.getMajor() == "CS")
        {
            st1.setMajor("Mathematics");
        }
        System.out.println(st1.getMajor());
    }
}
