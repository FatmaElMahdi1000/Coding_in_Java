package AAST_AssignCh6_REVIEW;
import java.util.*;

public class Bank
{
    //attributes
    static int NextCust = 1;
    int MaxQueueSize = 6;
    //Using Queue to build the CustQueue
    Queue<Customer> CustQueue= new LinkedList<>();
    ArrayList<Teller> tellers = new ArrayList<>();
    //Statistics
    int servedCustomers = 0;
    int lostCustomers = 0;
    int totalWaitingTime = 0;

    //Measure the service time , note: it's random
    int getServiceTime()
    {
        Random rndTime = new Random();
        return rndTime.nextInt(1, 5);
    }
    int getTransactions() {
        Random rndTime = new Random();
        return rndTime.nextInt(1, 3); // 1 to 3
    }

    //Current time == Arrival time
    void AddOrRemoveNewCust(int currentTime) {
        if (CustQueue.size() >= MaxQueueSize) {
            System.out.println("The Queue is Full, Customer left!");
            lostCustomers++;
            return;
        } else
        {
            int serviceTime =getServiceTime();
            int transactions = getTransactions();
            Customer Cust = new Customer(NextCust++, currentTime, serviceTime, transactions);
            CustQueue.add(Cust);

        }
    }

    void AssignCustomersToTellers(int currentTime) {
        for (Teller t : tellers) {
            if (t.isFree() && !CustQueue.isEmpty()) {
                Customer Cust = CustQueue.poll(); //It grabs the person at the very front of the line, remove them from the line.(Queue func)

                totalWaitingTime += (currentTime - Cust.ArrivalTime);

                t.assignCustomer(Cust);
            }
        }
    }

    void ProcessTellers() {
        for (Teller t : tellers) {
            boolean finished = t.workOneUnit();
            if (finished) {
                servedCustomers++;
            }
        }
    }

    void DisplayQueue() {
        System.out.print("Queue: ");
        for (Customer c : CustQueue) {
            System.out.print("C" + c.CustID + " ");
        }
        System.out.println();
    }

    void DisplayTellers() {
        for (Teller t : tellers) {
            if (t.isFree()) {
                System.out.println("Teller " + t.id + ": Free");
            } else {
                System.out.println("Teller " + t.id + ": Serving C"
                        + t.currentCustomer.CustID +
                        " (" + t.RemainingTime + ")");
            }
        }
    }

    void printStats() {
        System.out.println("- STATISTICS -");
        System.out.println("Served Customers: " + servedCustomers);
        System.out.println("Lost Customers: " + lostCustomers);

        if (servedCustomers > 0) {
            System.out.println("Average Waiting Time: " +
                    (double) totalWaitingTime / servedCustomers);
        }
    }

}
