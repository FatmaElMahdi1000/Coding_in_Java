package Inheritance.Ex2;
import java.util.UUID;

public class Student extends Person{

    UUID StudentId;
    public Student( String Name)
    {
        super(Name);
        this.StudentId = UUID.randomUUID();
    }
    public static void main(String[] args)
    {
        Student s1 = new Student("Mohamed");
        System.out.println(s1.GetName());
    }

}
