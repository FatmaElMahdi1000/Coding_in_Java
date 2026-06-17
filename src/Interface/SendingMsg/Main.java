package Interface.SendingMsg;
import java.util.ArrayList;

import java.util.List;
public class Main {

    public static void main(String[] args)
    {
        // We create a list that holds "Sendable" objects
        List<Sendable> sendables = new ArrayList<>();
        sendables.add(new EmailNotification("alerts@hospital.com")); // Form 1
        sendables.add(new SMSNotification("+123456789")); // Form 1

        //This is an example of Polymorphism
        //sendables interface used in different ways(one as Email Not. an the other as SMS not)

        for(int i = 0; i < sendables.size(); i++)
        {
            sendables.get(i).sendMessage("Fatma", "Hi, there!");
        }
    }
}
