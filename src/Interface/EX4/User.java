package Interface.EX4;

public class User implements Loggable{

    public String UsrName;
    public String email;
    User(String email, String UsrName)
    {
        this.email = email;
        this.UsrName = UsrName;

    }

    @Override
    public String ConvertToText()
    {
        return "User Name: " + this.UsrName;
     }

}
