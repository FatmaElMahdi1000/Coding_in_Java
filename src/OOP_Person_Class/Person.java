package OOP_Person_Class;

public class Person {
    //attributes
    //private for Encapsulation + information hiding
    private String Name;
    private int age;
    //constructs to manipilate the attributes
    Person(String Name, int age)
    {
        setAge(age);
        this.Name = Name;
        this.age = age;
    }
    //setter to make an attribute writeable, , helps us accessing private attribute and overwrite
    void setAge(int age)
    {
        if(age <= 0)
        {
            throw new IllegalArgumentException("Age must be greater than 1");
        }
        this.age = age;
    }
    //Getter to make an attribute readable, helps us accessing private attribute and read them
    String getName()
    {
        return this.Name;
    }
    //Getter to make an attribute readable
    int getAge()
    {
        return this.age;
    }

    String msg()
    {
        return "The Name is " + Name + " and the age is "+ age;
    }

}
