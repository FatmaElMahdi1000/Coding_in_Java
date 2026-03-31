package JOptionpaneLib;
import com.sun.nio.sctp.MessageInfo;

import javax.swing.JOptionPane;
public class JoptionpaneEx1 {

    public static void main(String[] args)
    {
        String num1 = JOptionPane.showInputDialog(null, "Please Enter the first number: ");
        String num2 = JOptionPane.showInputDialog(null, "Enter the 2nd number: ");
        int x = Integer.parseInt(num1);
        int y = Integer.parseInt(num2);
        int z = x + y;
        JOptionPane.showMessageDialog(null, "The Sum is "+ z);
    }

}
