package MidTermRevision.ReferenceVsPrimitive;
//Primitive data type
public class salary {

    int EmpSalary;
    salary(int EmpSalary)
    {
        this.EmpSalary = EmpSalary;
    }
    int salaryIncrease()
    {
        EmpSalary = EmpSalary + 100;
        return EmpSalary;
    }

    public static void main(String[] args)
    {
        salary salary1 = new salary(1000);
        System.out.println(salary1.EmpSalary);
        int money = salary1.EmpSalary; //it took a copy of the salary 1000$, but if salary1.EmpSalary has
        //increased due to calling the method, the money variable stays 1000$ since it's a copy
        System.out.println("primitive data type (Money) before the method call: " + money); //1000
        System.out.println(salary1.salaryIncrease());
        System.out.println(salary1.EmpSalary);
        System.out.println("primitive data type (Money) after the method call: " + money); //1000

    }


}
