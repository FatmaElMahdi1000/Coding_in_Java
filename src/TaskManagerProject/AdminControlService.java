package TaskManagerProject;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

//#2 - "Separating The Class Functionality or Service - Admin Module" NEW CLASS for SpringBoot bestpractices
public class AdminControlService {
    //(b)Getting List of Employees from the Emp Class / Temporary DB
    private List<Employee> EmpDatabase = new ArrayList<>();

    //Employee Type //Here we can find the "ADMIN" as well
    private List<String> EmployeeType = new ArrayList<>(List.of("ADMIN", "LEADER", "DEVELOPER", "HR", "TESTER"));

    //(d) TaskPhases
    List <String> TaskPhases = new ArrayList<>(List.of("PENDING", "UNDER WORK", "TEST", "Evaluation", "Cancelled"));

    //(e) Project List
    List<Project> ProjDataBase = new ArrayList<>();

    //For Login in:
    private Employee currentLoggedInUser;

    //Search for the Entire Employee object to get all info, Using Stream
    public Employee getEmployeeById(UUID id) {
        return EmpDatabase.stream()
                .filter(e -> e.getEmpID().equals(id))
                .findFirst()
                .orElse(null);
    }
//EMPLOYEE
    // Admin(b) Add Employee                                        //Adding the entire set of type not adjusting one
    public Employee CreateEmployee(String empName, String empEmail, String EmployeeRole)
    {
        if(EmployeeType.contains(EmployeeRole.toUpperCase()))
        {
            Employee newEmployee = new Employee(empName, empEmail, EmployeeRole);
            EmpDatabase.add(newEmployee);
            System.out.println("Employee created successfully with role: " + EmployeeRole);
            return newEmployee; //REVIEW I CAN MAKE IT VOID
        }
        else
        {
            System.out.println("ERROR: '" + EmployeeRole + "' is not a valid Employee Type!");
            return null; // Return null so the main program knows it failed
        }
    }

    // Admin(b)  Delete Employee(Search for Employee + then Delete)
    public void deleteEmployee(UUID id) {
        Employee FoundEmp = getEmployeeById(id);
        if (FoundEmp != null) {
            EmpDatabase.remove(FoundEmp);
            System.out.println("Employee deleted successfully.");
        }
    }

    // Admin(b)    Update Employee(NAME, EMAIL ONLY)
    public void updateEmployeeName(UUID id, String newName, String newEmail) {
        Employee FoundEmp = getEmployeeById(id);
        if (FoundEmp != null) {
            FoundEmp.setEmpName(newName); //Update Employee name
            FoundEmp.setEmpEmail(newEmail); //Update Employee Email
        }
    }
//EMPLOYEE TYPE
    //c)(Add) employees’ type. Done
    void AddEmpType(String newType) {
        if (!EmployeeType.contains(newType.toUpperCase())) {
            EmployeeType.add(newType.toUpperCase());
            System.out.println("The New Employee Type Has Been Added SUCCESSFULLY!");
        }
        else
        {
            System.err.println("ERROR: The Employee Type Already Present!");
        }
    }

    //c)(update) employees’ type. Done
    void UpdateEmpType(String newType, String oldType) {
        if (EmployeeType.contains(oldType.toUpperCase())) //checking if the type is found in the list, that we'd like to replace
        {
            //old type index in the list
            int index = EmployeeType.indexOf(oldType.toUpperCase());
            EmployeeType.set(index, newType.toUpperCase());
            System.out.println("Updated successfully!");
        } else {
            System.out.println("ERROR: Type Not Found!");
        }
    }

    //c)(delete) employees’ type. Done
    void DeleteEmployeeType(String DeletedType) {
        if (EmployeeType.contains(DeletedType.toUpperCase())) {
            EmployeeType.remove(DeletedType.toUpperCase());
            System.out.println("Type has been removed successfully!");
        } else {
            System.err.println("ERROR: Type Not Found!");
        }
    }
//TASK PHASES

    //(C) Add Task Phases
    void AddTaskPhase(String newPhase)
    {
        if(!TaskPhases.contains(newPhase.toUpperCase()))
        {
            TaskPhases.add(newPhase.toUpperCase());
            System.out.println("The New Task Phase Added SUCCESSFULLY!");
        }
        else
        {
            System.err.println("ERROR: The Task Phase Already Present!");
        }
    }

    //(C) Update Task Phases
    void UpdateTaskPhase(String newPhase, String oldPhase)
    {
        if(TaskPhases.contains(oldPhase.toUpperCase()))
        {
            int index = TaskPhases.indexOf(oldPhase.toUpperCase());
            TaskPhases.set(index, newPhase.toUpperCase());

            System.out.println("Updated successfully!");
        } else {
            System.out.println("ERROR: Type Not Found!");
        }

    }
    //(C) Delete Task Phases
    void DeleteTaskPhase(String TaskPhase)
    {
        if(TaskPhases.contains(TaskPhase.toUpperCase()))
        {
            TaskPhases.remove(TaskPhase.toUpperCase());
            System.out.println("Task Phase has been removed successfully!");
        }
        else
        {
            System.err.println("ERROR: Task Phase Not Found!");
        }

    }
//PROJECTS
    //(e) Search for the project
    Project getProject(UUID projId)
    {
        return ProjDataBase.stream()
                .filter(project-> project.getProjId().equals(projId))
                .findFirst()
                .orElse(null);

    }
    //(e) add project
    public void CreateProject(String ProjectName, String Customer)
    {
        Project project = new Project(ProjectName, Customer);
        ProjDataBase.add(project);
        System.out.println("Project '" + ProjectName + "' added successfully!");
    }
    //(e) Update project
    public void UpdateProject(UUID projID, String ProjectName, String Customer)
    {
        Project ProjFound = getProject(projID);
        if(ProjFound != null)
        {
            ProjFound.setProjName(ProjectName);
            ProjFound.setCustomerName(Customer);
        }
    }

    //Login & logout Service:
    public Employee Login(String EmpEmail) {
        //Search in the database for the emp. with the email
        Employee FoundEmp = EmpDatabase.stream().filter(Employee -> Employee.getEmpID().equals(EmpEmail))
                .findFirst().orElse(null);
        if (FoundEmp != null) {
            //Review
            this.currentLoggedInUser = FoundEmp;
            System.out.println("WELCOME: " + FoundEmp.getEmpName() + " logged in as " + FoundEmp.getEmployeeRole());
            return FoundEmp;
        } else {
            System.err.println("LOGIN FAILED: User not found.");
            return null;

        }
    }
    //LOGOUT
    public void logout() {
        if (currentLoggedInUser != null) {
            // If someone is actually logged in, say their name
            System.out.println("USER " + currentLoggedInUser.getEmpName() + " logged out.");
        } else {
            // If nobody was logged in, just say a general message
            System.out.println("No user was logged in.");
        }

        // Clear the session  (Below line for logging out)
        this.currentLoggedInUser = null;
    }

}

