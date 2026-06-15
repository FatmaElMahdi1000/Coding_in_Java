package OOPRelationships.SprintPlanningSystem;
import java.util.*;

public class Sprint {
    private String sprintName;
    SprintBudget SB;
    double initialFunding;

    //Aggregation: Sprint has tasks
    List <Task> ts = new ArrayList<>();

    Sprint(String sprintName, List <Task> ts, double initialFunding)
    {
        this.ts = ts;
        this.sprintName = sprintName;
        this.SB = new SprintBudget(initialFunding); //initialization of sprint budget as sprint budget cannot exist without the sprint -- Composition relation
    }

    public String getSprintName() {
        return sprintName;
    }

    public void setSprintName(String sprintName) {
        this.sprintName = sprintName;
    }

    public SprintBudget getSB() {
        return SB;
    }

    public void setSB(SprintBudget SB) {
        this.SB = SB;
    }

    public double getInitialFunding() {
        return initialFunding;
    }

    public void setInitialFunding(double initialFunding) {
        this.initialFunding = initialFunding;
    }

    public List<Task> getTs() {
        return ts;
    }

    public void setTs(List<Task> ts) {
        this.ts = ts;
    }
    // add task
    public void addTask( Task newTask)
    {
        this.ts.add(newTask);
        System.out.println("Task '" + newTask.getTaskTitle() + "' added successfully to the sprint.");

    }
}

class SprintBudget
{
    double budget;
    SprintBudget(double budget)
    {
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }
}
