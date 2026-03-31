package JOptionpaneLib;
import java.util.*; //array
import javax.swing.JOptionPane;

public class JoptionpaneEx2
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        ArrayList<String> PatientNames = new ArrayList<>();
        int i = 1;
        while(i <= 3)
        {
            String name = JOptionPane.showInputDialog(null, "Enter the patient #" + i +  " name");
            PatientNames.add(name);
            i++;
        }
        //Formatting what's in the array
        String formattedList = String.join("\n", PatientNames);
        JOptionPane.showMessageDialog(null, formattedList, "Patient Records", JOptionPane.INFORMATION_MESSAGE);
    }

}
