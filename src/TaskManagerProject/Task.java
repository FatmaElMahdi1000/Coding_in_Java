package TaskManagerProject;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;
import java.util.ArrayList;
import java.util.List;

//ENTITY CLASS: (Task Module a) Task Page):
//Note:UUID data type; makes the IDs unique across different systems, can be
public class Task {
    private UUID TaskCode; //taskid
    private String Taskdescription;
    private String TaskTitle;

    //Connecting this class with the other classes Employee / Project
    private Employee TaskAssignedEmp;
    private Project TaskProject;

    // Status & Priority
    private String taskPhase;         // From your TaskPhases list (PENDING for ex)
    private String priority;          //   LOW, MEDIUM, HIGH

    //MetaData
    private String CreatorName;
                   //Review
    LocalDateTime StartDate;
    LocalDateTime EndDate;
    private int estimationHours;

    // Constructor
    public Task(String TaskTitle, String Taskdescription, Employee TaskAssignedEmp,
                Project TaskProject, String priority, int estimationHours, String CreatorName)
    {
        this.TaskCode = UUID.randomUUID();
        this.TaskTitle = TaskTitle;
        this.Taskdescription = Taskdescription;
        this.StartDate = LocalDateTime.now(); //Now, one a task created. it's created now.
        this.TaskProject = TaskProject;
        this.priority = priority;
        this.TaskAssignedEmp = TaskAssignedEmp;
        this.CreatorName = CreatorName;
        this.taskPhase = "PENDING"; //PENDING BY DEFAULT;
        this.estimationHours = estimationHours;
    }


    //Getters AND setters
    public UUID getTaskCode() {
        return TaskCode;
    }

    public String getTaskdescription() {
        return Taskdescription;
    }

    public String getTaskTitle() {
        return TaskTitle;
    }

    public Employee getTaskAssignedEmp() {
        return TaskAssignedEmp;
    }

    public Project getTaskProject() {
        return TaskProject;
    }

    public String getTaskPhase() {
        return taskPhase;
    }

    public String getPriority() {
        return priority;
    }

    public String getCreatorName() {
        return CreatorName;
    }

    public LocalDateTime getStartDate() {
        return StartDate;
    }

    public LocalDateTime getEndDate() {
        return EndDate;
    }

    public int getEstimationHours() {
        return estimationHours;
    }

    public void setTaskdescription(String taskdescription) {
        Taskdescription = taskdescription;
    }

    public void setTaskTitle(String taskTitle) {
        TaskTitle = taskTitle;
    }

    public void setTaskPhase(String taskPhase) {
        this.taskPhase = taskPhase;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public void setCreatorName(String creatorName) {
        CreatorName = creatorName;
    }

    public void setStartDate(LocalDateTime startDate) {
        StartDate = startDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        EndDate = endDate;
    }

    public void setEstimationHours(int estimationHours) {
        this.estimationHours = estimationHours;
    }

    public void setTaskAssignedEmp(Employee taskAssignedEmp) {
        TaskAssignedEmp = taskAssignedEmp;
    }
}
