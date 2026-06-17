package Interface.smarthomeDeviceEcosystem;

public class Main {

    public static void main(String[] args) {

        // Treat it strictly as a switch
        SmartBulb SB1 = new SmartBulb();
        Switchable SW1 = SB1;
        SW1.TurnOn();


    }
}