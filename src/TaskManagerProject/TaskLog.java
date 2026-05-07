package TaskManagerProject;
import java.util.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;

//TASK Log (time spent by employee on a task)
public class TaskLog
{
    private LocalDateTime fromTime;
    private LocalDateTime toTime;

    //Connecting the "TaskLog" with the other classes, Employee and Task
    private Employee employee;
    private Task task;

    //Constructor
    public TaskLog(Employee employee, Task task, LocalDateTime from, LocalDateTime to) {
        this.employee = employee;
        this.task = task;
        this.fromTime = from;
        this.toTime = to;
    }

    //Method to calculate duration for the "Actual Time" spent on a TASK
    public long getMinutesSpent() {
        //REVIEW Duration
        return Duration.between(fromTime, toTime).toMinutes();
    }

    public LocalDateTime getFromTime() {
        return fromTime;
    }

    public LocalDateTime getToTime() {
        return toTime;
    }
}
