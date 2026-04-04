package MidTermRevision;

public class ArrayOfObjects {
    //attributes
    static String accountType = "Savings";
    private int accountNum;
    private int accountBalance; //0 by default
    String CustomerName; //null by default

    ArrayOfObjects(int accountNum, String CustomerName, int accountBalance)
    {
        this.accountNum = accountNum;
        this.CustomerName = CustomerName;
        this.accountBalance = accountBalance;
    }

    //its purpose creating objects later without giving any initial values
    ArrayOfObjects()
    {

    }

    public int getAccountNum() {
        return accountNum;
    }

    public int getAccountBalance() {
        return accountBalance;
    }
}

class test
{
    //here I used the 2nd constructor with no values.

    public static void main (String[] args)
    {
        //calling non-parametrized constructor - Works fine
        ArrayOfObjects obj1 = new ArrayOfObjects();
        System.out.println(obj1.CustomerName); //null by default
        //calling parametrized constructor - Works fine
        ArrayOfObjects obj2 = new ArrayOfObjects(345, "Fatma", 455);
        //another object of non-parametrized or parameterized constructors:  Arrays of objects
        ArrayOfObjects[] accounts = new ArrayOfObjects[3];
        accounts[0] = new ArrayOfObjects(345, "Fatma", 455);
        accounts[1] = new ArrayOfObjects(345, "Mohamed", 455);
        accounts[2] = new ArrayOfObjects(); //this will give null

        for(int i = 0; i < 3; i++)
        {
            System.out.println("User#" + (i+1));
            System.out.println("Name: " + accounts[i].CustomerName+"\n" +
                    "Account Balance: " + accounts[i].getAccountBalance()+"\n"+
                    "Account Number: " + accounts[i].getAccountNum());
        }

    }

}
