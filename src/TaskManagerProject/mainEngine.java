package TaskManagerProject;

//REVIEW:
public class mainEngine {
    public static void main(String[] args) {
        // 1. Setup our Services
        AdminControlService adminService = new AdminControlService();
        TaskService taskService = new TaskService();

        // 2. Create some Employees (Admin Module)
        Employee admin = adminService.CreateEmployee("Fatma", "Fatma@company.com", "ADMIN");
        Employee dev = adminService.CreateEmployee("Sara", "sara@company.com", "DEVELOPER");

        // 3. Create a Project
        adminService.CreateProject("AI Integration", "Google");
        Project project = adminService.ProjDataBase.get(0);

        // 4. Test Login
        System.out.println("\n--- Testing Login ---");
        adminService.Login("Fatma@company.com");

        // 5. Create a Task (Task Module)
        System.out.println("\n--- Testing Task Creation ---");
        Task t1 = taskService.CreateTask(admin, "Build API", "Develop the login endpoint", dev, project, "HIGH", 10, "Fatma");

        // 6. Test Security (Try to let the DEV reassign a task - SHOULD FAIL)
        System.out.println("\n--- Testing Security (Should Fail) ---");
        taskService.Reassigntask(dev, t1, admin);

        // 7. Test Visibility (Sara should only see her 1 task)
        System.out.println("\n--- Testing Employee View ---");
        var sarasTasks = taskService.getTasksForEmployee(dev);
        System.out.println("Sara sees " + sarasTasks.size() + " tasks.");

        // 8. Test Evaluation
        System.out.println("\n--- Testing Evaluation ---");
        taskService.evaluateTask(admin, t1, "DONE");
    }
}