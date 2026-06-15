package OOPRelationships.SprintPlanningSystem;

import java.util.List;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        SprintReport SR = new SprintReport();
        Dev Dev1 = new Dev("Fatma");
        final int MAX_CAPACITY = 3;
        SprintBudget SB1 = new SprintBudget(5000);
        List<Task> ts = new ArrayList<>();
        Sprint S = new Sprint("Sprint1", ts, SB1.getBudget());
        Scanner sc = new Scanner(System.in);


        boolean running = true;
        while(ts.size() < MAX_CAPACITY)
        {
            System.out.print("Enter the name of the task: ");
            String input = sc.nextLine();

            Task userTask = new Task(input);
            S.addTask(userTask);
            System.out.println("Current task count: " + ts.size() + "\n");
        }

        ts.get(0).setCompleted(true);
        ts.get(1).setCompleted(true);
        ts.get(2).setCompleted(true);
        SR.reviewSprintPerformance(Dev1, S);

    }
}
