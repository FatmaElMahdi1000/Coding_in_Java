package OOP_ConstructorConcept;

public class Student {
    //attributes
    String Name = "Spongepop";
    int age;
    double GPA;
    boolean IsEnrolled;
    //if we'd like to create many students objects with different names
    // constructor = A special method to initialize objects
    // You can pass arguments to a constructor
    // and set up initial values
    Student(String Name, int age, double GPA)
    {
        //this. refers to the object we're currently working with.
        this.Name = Name;
        this.age = age;
        this.GPA = GPA;
        this.IsEnrolled = true;

    }

    void study()
    {
        //we're replacing this with Student1.Name for an example.
        System.out.println(this.Name + " is Studying!");
    }

}
