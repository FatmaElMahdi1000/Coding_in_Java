package MidTermRevision.Loops;
import java.util.*;

public class ScissorRockPaper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int CompChoice;
        String UserChoice; //starts as String then convert to int

        while (true) {  // infinite loop, will run until we break
            CompChoice = rnd.nextInt(3); // generates 0, 1, or 2
            System.out.print("scissor (0), rock (1), paper (2), q to quit: ");
            UserChoice = sc.nextLine();

            // Quit check first/ Handling it first
            if (UserChoice.equals("q")) {
                System.out.println("Game ended.");
                break;
            }
            //Continue with UserChoice as string.
            if (!UserChoice.matches("[0-2]"))
            {
                System.out.println("Choose 0, 1, or 2!");
                continue; // Make while loop starts over, else this is going to be ignored and will continue with the program
            }

            // convert to int
            int UserNum = Integer.parseInt(UserChoice);

            if (UserNum == CompChoice) {
                System.out.println("It's a tie!");
            } else if (CompChoice == 0 && UserNum == 2) {
                System.out.println("The Computer is scissor and user chose paper, Comp won!");
            } else if (CompChoice == 2 && UserNum == 0) {
                System.out.println("The user is scissor and Computer chose paper, User won!");
            } else if (CompChoice == 1 && UserNum == 0) {
                System.out.println("The user is scissor and Computer chose Rock, Comp won!");
            } else if (CompChoice == 0 && UserNum == 1) {
                System.out.println("The user is Rock and Computer chose scissor, User won!");
            } else if (CompChoice == 2 && UserNum == 1) {
                System.out.println("The user is Rock and Computer chose Paper, Computer won!");
            } else if (CompChoice == 1 && UserNum == 2) {
                System.out.println("The Computer is Rock and User chose Paper, User won!");
            }

        }

    }
}