package Basics;
import javax.swing.JOptionPane;

public class ConvertStringToNum {
    public static void main()
    {
        String a = JOptionPane.showInputDialog(null, "Enter the first number: ");
        String b = JOptionPane.showInputDialog(null, "Enter the 2nd number: ");
        int x = Integer.parseInt(a);
        int z = Integer.parseInt(b);
        int y = x + z;
        JOptionPane.showMessageDialog(null, y);
    }

}
