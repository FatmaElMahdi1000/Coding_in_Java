package AbstractPrinciple.Ex2;

public class Main {
    public static void main(String[] args)
    {
        Eagle egl = new Eagle(34, "weak");
        Hawk hk = new Hawk(34, "High");
        System.out.println(egl.fly());
        egl.setSize(50);
        System.out.println(egl.fly());
        System.out.println(hk.fly());
    }
}
