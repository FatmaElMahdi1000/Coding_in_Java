package OOP_Person_Class;

public class Main {
    public static void main(String[] args)
    {

        Person person1 = new Person("Fatma", 29);
        Person person2 = new Person("Mohamed", 32);
        System.out.println(person1.msg());
        System.out.println(person2.msg());
        //if we put final before age in the class, it will never be allowed to change.
        System.out.println("Person 1 Age = "+ person1.getAge());
        //accessed the age attribute even with private modifier and change it to 23 with Setter Method.
        person1.setAge(23);
        //then read the new value using get method
        System.out.println("Person 1 Age = " + person1.getAge());
        Person person3 = new Person("Ahmed", 33);
        car owner1 = new car("Kia",2015, person3);
        System.out.println(owner1.new_msg());

    }
}
