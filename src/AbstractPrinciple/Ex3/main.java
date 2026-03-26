package AbstractPrinciple.Ex3;

public class main {

    public static void main(String[] args)
    {
        Bicycle bi1 = new Bicycle(23);
        Car C1 = new Car(32);

        System.out.println(bi1.getrandomcolour());
        System.out.println(bi1.colour());
        System.out.println(C1.getrandomcolour());
        System.out.println(C1.colour());

    }
}
