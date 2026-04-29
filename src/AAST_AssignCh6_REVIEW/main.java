package AAST_AssignCh6_REVIEW;

import java.util.Random;

public class Main
{
    public static void main(String[] args) {

        Bank myBank = new Bank();
        int maxTime = 20; // How long the simulation runs
        int nextArrivalTime = 0;
        Random rnd = new Random();


        myBank.tellers.add(new Teller(1));
        myBank.tellers.add(new Teller(2));


        for (int time = 0; time < maxTime; time++) {
            System.out.println("\nTime: " + time);


            if (time == nextArrivalTime) {
                myBank.AddOrRemoveNewCust(time);
                int gap = rnd.nextBoolean() ? 2 : 4;
                nextArrivalTime = time + gap;
            }


            myBank.AssignCustomersToTellers(time);
            myBank.ProcessTellers();
            myBank.DisplayQueue();
            myBank.DisplayTellers();

            System.out.println("----------------------");
        }


        myBank.printStats();
    }


}


