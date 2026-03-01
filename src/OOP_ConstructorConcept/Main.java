package OOP_ConstructorConcept;

public class Main {

    public static void main(String[] args)
    {
        Student student1 = new Student("Fatma", 29, 3.40);
        Student student2 = new Student("Mohamed", 32, 3.50);
        Student student3 = new Student("Sandy", 27, 4.9);
        System.out.println("Student Name:"  +student1.Name);
        System.out.println("Student Name:"  +student2.Name);
        System.out.println(student1.IsEnrolled);
        System.out.println(student3.Name + "\n"+ student3.age + "\n" +student3.GPA );
        //Using a method created in the class:
        student1.study();
        student2.study();

    }
}
