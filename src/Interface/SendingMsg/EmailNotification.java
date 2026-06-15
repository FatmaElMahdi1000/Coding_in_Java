package Interface;

 class EmailNotification implements Sendable{

    private String Email;
    EmailNotification(String Email)
    {
        this.Email = Email;
    }

    @Override
    public void sendMessage(String recipient, String message)
    {
        System.out.println("SMS sent via " + this.Email + "Sent to " + recipient + "Message: "+ message);

    }


}
