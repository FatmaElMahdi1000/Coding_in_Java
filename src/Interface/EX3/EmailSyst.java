package Interface.EX3;

//Sendable here like the action of the email system, interface is like what a class can do(Actions):
public class EmailSyst implements Sendable{

    public String message;
    public EmailSyst(String message)
    {
        this.message = message;
    }
    @Override
    public void sendNotification( )
    {
        // Accessing the interface's constant parameter directly
        System.out.println("Email sent via " + Protocol + ": " + message);
    }

}
