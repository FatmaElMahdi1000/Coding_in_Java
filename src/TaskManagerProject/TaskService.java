package TaskManagerProject;
import java.time.LocalDateTime;
import java.util.*;


//Task Module (C), (e), (d)
//e)The leader can manage the tasks (create, show all, evaluation,
// reassign task, change any filed in the task).

public class TaskService
{
    private  List <Task> GlobalTask = new ArrayList<>();
    private  List <TaskLog> TaskLog = new ArrayList<>();

    //Task Module(e)Task Creation

    public Task CreateTask(Employee Requestor, String TaskTitle, String Taskdescription, Employee TaskAssignedEmp,
                           Project TaskProject, String priority, int estimationHours, String CreatorName) {
        //Added: Employee Requestor to check if the requestor is only an Admin or a leader to assign the task
        if (LeaderOrAdmin(Requestor)) {
            //Requester is already an instance of Employee, we can add a name of the requestor: Requestor.getEmpName()
            Task newTask = new Task(TaskTitle, Taskdescription, TaskAssignedEmp, TaskProject, priority, estimationHours, Requestor.getEmpName());
            //Add to global database
            GlobalTask.add(newTask);

            System.out.println("SUCCESS: Task '" + TaskTitle + "' created and assigned to " + TaskAssignedEmp.getEmpName());

            return newTask;
        } else {
            System.err.println("ACCESS DENIED: Only Leaders or Admins can create tasks.");
        }
        return null;
    }

        //Permission Checking Emp Role, if Leader or Admin: he/ SHe can add task to an employee
        boolean LeaderOrAdmin(Employee Emp) {
            String EmpRole = Emp.getEmployeeRole();
            return EmpRole.equals("LEADER") || EmpRole.equals("ADMIN"); //will return true or false

        }
        //Task Module(e) Calendar show all employees tasks and phases.  /Every Employee Can See his/her Tasks
    public List<Task> getTasksForEmployee(Employee emp)
    {
        //checking again if the emp who wants to see tasks is admin/leader(Can View All Tasks)
        //or Regular tasks(Can view only his / her tasks)
        if(LeaderOrAdmin(emp))
        {
            return GlobalTask; //return the entire database
        }
        else
        {
            //filtering the Employee task using Stream
            return GlobalTask.stream().filter(Task->Task.getTaskAssignedEmp().getEmpID().equals(emp.getEmpID()))
                    .toList();

        }
    }
    //Reassign the task
    public void Reassigntask(Employee Requestor, Task task, Employee newAssignee)
    {
        if(LeaderOrAdmin(Requestor))
        {
            task.setTaskAssignedEmp(newAssignee);
            System.out.println("SUCCESS: Task reassigned to " + newAssignee.getEmpName());
        } else {
            System.err.println("DENIED: Only Leaders/Admins can reassign tasks.");
        }
    }
    // Evaluation  Changing tha phase to "EVALUATION", "TEST", or "DONE"
    public void evaluateTask(Employee requester, Task task, String evaluationPhase) {
        if (LeaderOrAdmin(requester)) {
            // Changing tha phase to "EVALUATION", "TEST", or "DONE"
            task.setTaskPhase(evaluationPhase.toUpperCase());
            System.out.println("SUCCESS: Task phase updated to " + evaluationPhase);
        } else {
            System.err.println("DENIED: Only Leaders can evaluate tasks.");
        }
    }
    //Changing Amy Field in the Task by the "ADMIN/LEADER"
    public void ChangeTaskFields(Task task, Employee Requestor, String newTaskTitle, String newTaskdescription,
                                 Project TaskProject, String newPriority, int newEstimationHours, String newCreatorName, String newPhase)
    {
        if(LeaderOrAdmin(Requestor))
        {
            task.setTaskPhase(newPhase.toUpperCase());
            task.setTaskTitle(newTaskTitle);
            task.setEstimationHours(newEstimationHours);
            task.setPriority(newPriority);
            task.setTaskdescription(newTaskdescription);
            System.out.println("SUCCESS: Task [" + task.getTaskCode() + "] has been modified by Leader: " + Requestor.getEmpName());
        } else {
            System.err.println("PERMISSION DENIED: You are not authorized to edit task fields.");
        }

    }


    }


//NOTE
//The Difference:
//findFirst().orElse(null): This tells Java: "Search the list, and the moment you find one task that matches this employee, stop searching and give me just that one (or nothing)."
//
//.toList() (or .collect): This tells Java: "Search the entire list and give me every single task that belongs to this employee."