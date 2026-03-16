package ATMProject.Transaction;
import javax.swing.JOptionPane;
//this class is like a service, we'll let ATM class use it later
//all methods here must be public to get used by ATM package.
public class TransHistory
{
    //attribute
    //array of 10 strings
    private String[] logs;
    private int index = 0;
    int size;
//by default seen in this package only, we'll add public to get seen by ATM pkg as well
    public TransHistory(int size)
    {
        this.logs = new String[size];
        this.index = 0;
    }
    //REVIEW
    public void record(String action, String time)
    {
        if(index < logs.length)
        {
            logs[index] = action + " | Trans. Time: "+ time;
            index++;
        }
    }
    public void displayhistorylog(String fullname)
    {
        String report = "---History Log for " + fullname + "---"+ "\n";
        if(index == 0)
        {
            report += "No transactions found.";

        }
        else {
            for(int i = 0; i< index; i++)
            {
                report += (i+1) + "- " + logs[i] + "\n" ;
            }
        }
        JOptionPane.showMessageDialog(null,report,"Bank Statement", JOptionPane.INFORMATION_MESSAGE);
    }

}
