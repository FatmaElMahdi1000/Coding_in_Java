package ATMProject.ATM;
//we're imorting Trans. package since ATM takes the action(Deposit, etc)
// and the TransHistory records the action
import ATMProject.Transaction.TransHistory;

import javax.swing.JOptionPane;
//to update the LastUpdate attribute with PC time.
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ATM {
    //private attributes
    //in the program: Account_ID, HolderFirst_Name, HolderLast_Name, dailyWithdrawalLimit
    //Balance

    //ask the user to enter: HolderFirst_Name, HolderLast_Name , Pin_Number,

    private int AccountID;
    private int PinNumber;
    private String FirstName;
    private String LastName;
    private double dailyWithdrawalLimit;
    private double Balance;
    private String LastUpdate;
    //History log object
    private TransHistory myHistory;

    // Step A: We  "Load" the data (Constructor), build our data
    ATM(int AccountID, String FirstName, String LastName , int PinNumber, double dailyWithdrawalLimit, double Balance, String LastUpdate)
    {
        this.FirstName =  FirstName;
        this.LastName =  LastName;
        this.PinNumber =  PinNumber;
        this.AccountID = AccountID;
        this.Balance = Balance;
        this.dailyWithdrawalLimit = dailyWithdrawalLimit;
        this.LastUpdate = LastUpdate;
        this.myHistory = new TransHistory(10);
    }
    //for reading data in main as all are private
    int getPinNumber(){return PinNumber;}
    String getFullName(){return FirstName + " " +  LastName; };
    int getAccountID(){return AccountID; }
    double getBalance(){return Balance; }
    double GetDWithdrawalLimit(){return dailyWithdrawalLimit; }
    String getLastUpdate(){ return LastUpdate; }

    //REVIEW
    // A   helper method to get the PC's current time
    //I put it as public to get used in the transhistory file, seen by other packages
    public String getCurrentTime() {
        LocalDateTime now = LocalDateTime.now(); // Gets current date and time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return now.format(formatter); // Returns it as "16-03-2026 18:45:12"
    }

    //REVIEW
    //ATM deposit calculations
    void deposit(double NewAmount)
    {
        Balance += NewAmount;
        myHistory.record("Deposited: $" + NewAmount + " | Balance $ "+ Balance, getCurrentTime());
        System.out.println("SUCCESS: Deposited $" + NewAmount + "Current Balance $ "+ Balance);
    }
    //ATM Withdraw calculations
    void withdrawing(double SubstractedAmount)
    {
        //we need to check if the user has enough many first, commit to the withdrawal limit
        if(Balance < SubstractedAmount)
        {
            System.out.println("No Enough Money to withdraw, Request Declined!");
        }
        else if(SubstractedAmount > dailyWithdrawalLimit)
        {
            System.out.println("Limit Exceeded!");
        }
        else {
            Balance -= SubstractedAmount;
            // Record the action in your History object (from record method in TransHistory) it takes String
            myHistory.record("Withdrew: $" + SubstractedAmount + " | New Balance: $" + Balance, getCurrentTime());
            System.out.println("SUCCESS: Withdrew $" + SubstractedAmount + " | Current Balance: $" + Balance);
        }
    }
    //ATM Display msg
    void ShowBalanceMsg()
    {
        //building the ATM msg string
        String message = "___OFFICIAL RECEIPT___"+"\n"+
                "Full Name: "+getFullName()+"\n"
                + "Account ID: " + AccountID+"\n"
                + "Account Current Balance $: " + Balance+"\n"
                +"Last Updated: " + getCurrentTime();
        //INFORMATION_MESSAGE | A blue "i" icon. Used for general facts (like your balance).
        JOptionPane.showMessageDialog(null,message, "ATM Account Summary", JOptionPane.INFORMATION_MESSAGE);

    }
    public void showHistory()
    {
        myHistory.displayhistorylog(getFullName());
    }
}
