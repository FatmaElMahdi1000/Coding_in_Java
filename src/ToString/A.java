package ToString;

public class A {

    int i;
    int j;
    A(int i, int j)
    {
        this.i = i;
        this.j = j;
    }
    @Override
    public String toString() {
        return "A{" +
                "i=" + i +
                ", j=" + j +
                '}';
    }

    public static void main(String[] args)
    {
        A a = new A(3, 2);
        System.out.println(a.toString());
        System.out.println(a); //without accessing anything and it gave the toString return statement.
    }
}
