package Interface;

 class SMSNotification implements Sendable
{
    private String GateAwayNum;

    SMSNotification(String GateAwayNum)
    {
        this.GateAwayNum = GateAwayNum;

    }
    @Override
    public void sendMessage(String recipient, String message)
    {
        System.out.println("SMS sent via " + this.GateAwayNum + " Sent to " + recipient + "Message: "+ message);
    }
}
