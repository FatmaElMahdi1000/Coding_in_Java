package OOP_Person_Class;

public class Person {
    //private for Encapsulation + information hiding: // Private attributes: No one can touch these directly
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

class car
{
    //attributes
    private String model;
    private int made;
    //Composition: Instead of creating person3 inside the Car class hardcoded, we pass the Person into the Car constructor. This means any person can own any car.
    private Person owner;

    //Constructor
    car(String model, int made, Person owner)
    {
        this.model = model;
        this.made = made;
        this.owner = owner;
    }
    //setter to make it writable
    void setMade(int made)
    {
        if(made <= 0)
        {
            throw new IllegalArgumentException("Wrong year!");
        }
        this.made = made;
    }
    //make it readable
    String getModel(String model)
    {
        return this.model;
    }

    String new_msg()
    {
                           //owner is accessing person's class method.
        return this.owner.msg() + " and this person owns a model " + this.model + " made in " + this.made;
    }

}
