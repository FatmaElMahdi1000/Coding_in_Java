package MidTermRevision.Classes;
import java.util.*;
import javax.swing.*; //JOptionPane

public class Employee {
    int EmpID; //ID is Auto Incremented
    String name;
    Double salary;
    Employee()
    {
    }

    Employee(String name, Double salary)
    {
        this.name = name;
        this.salary = salary;
    }
    String getName()
    {
        return this.name;
    }

    Double getSalary()
    {
        return this.salary;
    }

    public static void main(String[] args)
    {
        //Salaries, Names, Entered by the user
        Scanner obj = new Scanner(System.in);
        //Array of objects of five employees
        Employee[] emp = new Employee[3];

        double HighestSalary = 0;
        int EmpIndex = 0;
        for(int i = 0; i <emp.length; i++)
        {
            //REVIEW
            emp[i] = new Employee();
            System.out.println("Enter the Employee Name: ");
            emp[i].name = obj.nextLine();
            System.out.println("Enter the Employee Salary: ");
            emp[i].salary = obj.nextDouble();
            obj.nextLine(); // clears the Enter key from input
            if(HighestSalary < emp[i].salary)
            {
                HighestSalary= emp[i].salary;
                EmpIndex = i;
            }
            emp[i].EmpID = i+1;
        }
        JOptionPane.showMessageDialog(null,"Employee Highest Salary info: \n"+
               "Name: " + emp[EmpIndex].name+"\n" +
                "ID: "  + emp[EmpIndex].EmpID + "\n"+
                "Salary: " + emp[EmpIndex].salary);
    }
}
