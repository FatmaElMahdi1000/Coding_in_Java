package OOPRelationships.SprintPlanningSystem;

public class SprintReport {


    //Association: method takes instances of other classes
    public void reviewSprintPerformance(Dev dev, Sprint sprint) {


        boolean allTasksCompleted = true;
        System.out.println("Analyzing " + sprint.getSprintName() + " for dev: " + dev.getEmpName());
        for (int i = 0; i < sprint.getTs().size(); i++) {
            if (!sprint.getTs().get(i).isCompleted) {
                allTasksCompleted = false;
                break;
            }
        }
        if(allTasksCompleted)
        {
            System.out.println("All tasks completed");
        }
        else
        {
            System.out.println("Some tasks are still in progress!");
        }

    }
}
