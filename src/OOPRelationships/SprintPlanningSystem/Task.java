package OOPRelationships.SprintPlanningSystem;

public class Task
{
    String TaskTitle;
    boolean isCompleted;
    Task(String TaskTitle)
    {
        this.isCompleted = false;
        this.TaskTitle = TaskTitle;
    }

    public String getTaskTitle() {
        return TaskTitle;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public void setTaskTitle(String taskTitle) {
        TaskTitle = taskTitle;
    }
}
