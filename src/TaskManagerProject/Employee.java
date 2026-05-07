package TaskManagerProject;
import java.time.LocalDateTime;
import java.util.UUID;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
//Note for SpringBoot: we start with "User Entity" then building "The Class Functionality or Service"
//Review

//Considering the Employee and the USER the same Thing.
public class Employee {

    private UUID empID;
    private String empName;
    private String empEmail;
    private LocalDateTime createdAt;
    private String EmployeeRole; //will get a copy of only a single employee type from: Admin class

    private List<Task> tasks = new ArrayList<>();

    public Employee() {
        this.empID = UUID.randomUUID();
        this.createdAt = LocalDateTime.now();
    }

    public Employee(String name, String email, String EmployeeRole) {
        this();
        this.empName = name;
        this.empEmail = email;
        this.EmployeeRole = EmployeeRole;
    }

    // Getters and Setters
    public UUID getEmpID() { return empID; }
    public String getEmpName() { return empName; }
    public List<Task> getTasks() { return tasks; }

    public String getEmployeeRole() {
        return EmployeeRole;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }



}


