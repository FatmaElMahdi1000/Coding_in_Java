package AbstractPrinciple.EX4;

public class Main {
    public static void main(String args[])
    {

        TV tv1 = new TV(2022);
        System.out.println(tv1.getManufacturingYear());
        tv1.DeviceOff();
        tv1.DeviceOn();
    }

}
