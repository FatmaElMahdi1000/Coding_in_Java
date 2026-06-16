package Inheritance.Ex1;

public class B extends A {

    public B()
    {
    }

    static void main(String[] args)
    {
        B b1 = new B();
        A A1  = new A();
        b1.i = 10;
        System.out.println(A1.i);
        System.out.println(b1.i);

    }



}
