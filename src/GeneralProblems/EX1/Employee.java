package GeneralProblems.EX1;

public class Employee {

    String fName;
    String lName;
    boolean hired; //// Defaults to false
    static int TotalCount;
    static int hiredCount;
    public Employee(String fName, String lName)
    {
        this.fName = fName;
        this.lName = lName;
        TotalCount++;
    }
    public void getAJob()
            {
                if(!hired) //it means if hired is false? which is true
                {
                    System.out.println("The Employee: "+ this.fName + " got the job!");
                    hired = true; //converted it to true since the person got hired.
        }
        hiredCount++; //incrementing the hired people.
    }
    public void loseAjob()
    {
        if(hired) //if person is already hired ???? since we before converted hired for the person who gets a job to true.
        {
            System.out.println("The Employee: "+ this.fName + " Lost his/her job!");
            hired = false; //circumstance happened and he lost the jobs, then we revert his hired to false
        }
        hiredCount--;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public boolean isHired() {
        return hired;
    }

    public void setHired(boolean hired) {
        this.hired = hired;
    }

    public static int getTotalCount() {
        return TotalCount;
    }

    public static void setTotalCount(int totalCount) {
        TotalCount = totalCount;
    }

    public static int getHiredCount() {
        return hiredCount;
    }

    public static void setHiredCount(int hiredCount) {
        Employee.hiredCount = hiredCount;
    }

    public static void main(String[] args)
    {
        Employee Emp1 = new Employee("Fatma", "ElMahdi");
        Employee Emp2 = new Employee("Mohamed", "Dawood");
        Employee Emp3 = new Employee("Sahar", "ElMahdi");
        System.out.println(getHiredCount());
        System.out.println(getTotalCount());

        Emp1.getAJob();
        Emp2.getAJob();
        Emp3.getAJob();
        Emp3.loseAjob();
        System.out.println("After the change in the team");
        System.out.println(getHiredCount());
        System.out.println(getTotalCount());



    }


}
